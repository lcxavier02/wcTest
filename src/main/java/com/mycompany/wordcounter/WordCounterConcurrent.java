/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author xvelazquez
 */
public class WordCounterConcurrent {
    private String filename;

    public WordCounterConcurrent(String filename) {
        this.filename = filename;
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
                System.out.println("File processed by: " + threadName);
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
