/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author xvelazquez
 */
public class WordCounter {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        String filename = "C:/Users/xvelazquez/Documents/NetBeansProjects/WordCounter/src/main/java/documents/1000000w.txt"; // Cambia 'tu_archivo.txt' al nombre de tu archivo

        // Contar palabras de forma secuencial
        long startTime = System.currentTimeMillis();
        WordCounterSequential sequentialCounter = new WordCounterSequential(filename);
        int wordCountSequential = sequentialCounter.countWords();
        long endTime = System.currentTimeMillis();

        System.out.println("Conteo de palabras de forma secuencial: " + wordCountSequential);
        System.out.println("Tiempo de ejecución secuencial: " + (endTime - startTime) + " milisegundos");

        // Contar palabras de forma concurrente
        startTime = System.currentTimeMillis();
        WordCounterConcurrent concurrentCounter = new WordCounterConcurrent(filename);
        int wordCountConcurrent = concurrentCounter.countWords();
        endTime = System.currentTimeMillis();

        System.out.println("Conteo de palabras de forma concurrente: " + wordCountConcurrent);
        System.out.println("Tiempo de ejecución concurrente: " + (endTime - startTime) + " milisegundos");
    }
}
