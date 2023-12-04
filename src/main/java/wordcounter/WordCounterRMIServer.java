package wordcounter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounterRMIServer extends UnicastRemoteObject implements WordCounterRMI {
    public WordCounterRMIServer() throws RemoteException {
        super();
    }
    
    public int countWords(String filename, int startWord, int endWord) throws RemoteException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int wordCount = 0;
            int currentWord = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    if (currentWord >= startWord && currentWord <= endWord) {
                        wordCount++;
                    }
                    currentWord++;
                    if (currentWord > endWord) {
                        break;
                    }
                }

                if (currentWord > endWord) {
                    break;
                }
            }

            return wordCount;
        } catch (IOException e) {
            throw new RemoteException("Error while reading the file.", e);
        }
    }
}
