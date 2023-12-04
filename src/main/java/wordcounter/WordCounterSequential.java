package wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounterSequential {
    private String filename;

    public WordCounterSequential(String filename) {
        this.filename = filename;
    }

    public int countWords() throws IOException {
        int wordCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        reader.close();
        return wordCount;
    }
}