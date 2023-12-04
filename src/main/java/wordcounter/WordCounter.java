package wordcounter;

import java.io.IOException;
import javax.swing.JFrame;
public class WordCounter {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}