package wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

public class WordCounterConcurrent {
    private String filename;
    JTextArea logger = new JTextArea();

    public WordCounterConcurrent(String filename, JTextArea log) {
        this.filename = filename;
        this.logger = log;
    }

    public int countWords() throws IOException, InterruptedException {
        final int numThreads = 4;
        final int[] wordCount = {0};
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                try {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] words = line.split("\\s+");
                        synchronized (this) {
                            wordCount[0] += words.length;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                String threadName = Thread.currentThread().getName();
                String logArea = ("File processed by: " + threadName + "\n");
                logger.setLineWrap(true);
                logger.append(logArea);
            });
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        reader.close();
        return wordCount[0];
    }
}
