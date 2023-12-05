package wordcounter;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;
import javax.swing.JTextArea;

public interface WordCounterRMI extends Remote {
    int countWords(String filename, int startWord, int endWord) throws RemoteException;
    void connectClient(UUID clientId, JTextArea logger) throws RemoteException;
}
