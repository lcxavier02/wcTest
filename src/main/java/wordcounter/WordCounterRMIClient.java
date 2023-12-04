package wordcounter;

import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JTextArea;

public class WordCounterRMIClient {
    WordCounterRMI service;
    
    public void startClient(String Ip, JTextArea logger) {
        try {
            String serverUrl = ("//"+ Ip+":1099/WordCounter");
        
            service = (WordCounterRMI) Naming.lookup(serverUrl);
            
            logger.append("Connected to server");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
