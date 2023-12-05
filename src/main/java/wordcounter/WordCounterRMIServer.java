package wordcounter;

import java.util.List;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.swing.JTextArea;

public class WordCounterRMIServer extends UnicastRemoteObject implements WordCounterRMI {
    private List<UUID> connectedClients = new ArrayList<>();
    
    public UUID generateID() {
        UUID id = UUID.randomUUID();
        return id;
    }
    
    public WordCounterRMIServer() throws RemoteException {
        super();
    }
    
    public void connection(String ip, JTextArea logger) {
        try {
            WordCounterRMI server = new WordCounterRMIServer();

            LocateRegistry.createRegistry(1099);
                
            java.rmi.Naming.rebind("//"+ip+":1099/WordCounter", server);
            
            logger.append("Server initialized.\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    
    public void connectClient(UUID clientId, JTextArea logger) throws RemoteException {
        connectedClients.add(clientId);
        logger.append("Client connected: " + clientId.toString() + "\n");
    }

    public List<UUID> getConnectedClients() {
        return connectedClients;
    }
}
