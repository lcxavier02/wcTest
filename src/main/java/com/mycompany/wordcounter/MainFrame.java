/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.wordcounter;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author xvelazquez
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("100");
        comboBoxModel.addElement("1000");
        comboBoxModel.addElement("10000");
        comboBoxModel.addElement("100000");
        comboBoxModel.addElement("1000000");
        comboBoxModel.addElement("2000000");
        ComboWords.setModel(comboBoxModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButtonInitProgram = new javax.swing.JButton();
        ComboWords = new javax.swing.JComboBox<>();
        msSeq = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        msConc = new javax.swing.JLabel();
        counterSeq = new javax.swing.JLabel();
        counterConc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyecto Segundo Parcial");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 480, 60));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contador de Palabras");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 250, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Secuencial");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 40));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Concurrente");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 150, 40));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tiempo de ejecucion:");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 150, 30));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tiempo de ejecucion:");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 140, 30));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Num. Palabras");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 120, 30));

        ButtonInitProgram.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInitProgram.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonInitProgram.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInitProgram.setText("Iniciar");
        ButtonInitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInitProgramActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonInitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 120, 30));

        ComboWords.setBackground(new java.awt.Color(102, 102, 102));
        ComboWords.setForeground(new java.awt.Color(255, 255, 255));
        ComboWords.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboWordsActionPerformed(evt);
            }
        });
        getContentPane().add(ComboWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 100, 30));

        msSeq.setBackground(new java.awt.Color(102, 102, 102));
        msSeq.setForeground(new java.awt.Color(255, 255, 255));
        msSeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msSeq.setOpaque(true);
        getContentPane().add(msSeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 120, 30));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Palabras contadas:");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 30));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Palabras contadas:");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 140, 30));

        msConc.setBackground(new java.awt.Color(102, 102, 102));
        msConc.setForeground(new java.awt.Color(255, 255, 255));
        msConc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msConc.setOpaque(true);
        getContentPane().add(msConc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 120, 30));

        counterSeq.setBackground(new java.awt.Color(102, 102, 102));
        counterSeq.setForeground(new java.awt.Color(255, 255, 255));
        counterSeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterSeq.setOpaque(true);
        getContentPane().add(counterSeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 100, 30));

        counterConc.setBackground(new java.awt.Color(102, 102, 102));
        counterConc.setForeground(new java.awt.Color(255, 255, 255));
        counterConc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterConc.setOpaque(true);
        getContentPane().add(counterConc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 100, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Xavi\\Documents\\NetBeansProjects\\wcTest\\src\\main\\java\\images\\bikini2.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 910, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboWordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboWordsActionPerformed

    private void ButtonInitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInitProgramActionPerformed
        try {
            String selectedValue = (String) ComboWords.getSelectedItem();

            String filename = "";

            if (selectedValue.equals("100")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/100w.txt";
            } else if (selectedValue.equals("1000")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/1000w.txt";
            } else if (selectedValue.equals("10000")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/10000w.txt";
            } else if (selectedValue.equals("100000")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/100000w.txt";
            } else if (selectedValue.equals("1000000")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/1000000w.txt";
            } else if (selectedValue.equals("2000000")) {
                filename = "C:/Users/Xavi/Documents/NetBeansProjects/wcTest/src/main/java/documents/2000000w.txt";
            }

            long startTime = System.currentTimeMillis();
            WordCounterSequential sequentialCounter = new WordCounterSequential(filename);
            int wordCountSequential = sequentialCounter.countWords();
            long endTime = System.currentTimeMillis();
            
            msSeq.setText((endTime - startTime) + " ms");
            counterSeq.setText(String.valueOf(wordCountSequential));

            startTime = System.currentTimeMillis();
            WordCounterConcurrent concurrentCounter = new WordCounterConcurrent(filename);
            int wordCountConcurrent = concurrentCounter.countWords();
            endTime = System.currentTimeMillis();
            
            msConc.setText((endTime - startTime) + " ms");
            counterConc.setText(String.valueOf(wordCountConcurrent));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonInitProgramActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonInitProgram;
    private javax.swing.JComboBox<String> ComboWords;
    private javax.swing.JLabel counterConc;
    private javax.swing.JLabel counterSeq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel msConc;
    private javax.swing.JLabel msSeq;
    // End of variables declaration//GEN-END:variables
}
