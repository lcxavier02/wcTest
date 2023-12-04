package wordcounter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WordCounterRMI extends Remote {
    int countWords(String filename, int startWord, int endWord) throws RemoteException;
}
