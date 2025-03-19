/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.kerneloso.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CalculatorView extends JFrame {

  public CalculatorView() {

    setResizable(false);
    setTitle("Calculator Swing");
    int width = 280;
    int height = 450;
    setSize(width, height);
    Toolkit localScreen = Toolkit.getDefaultToolkit();
    Dimension screenDimension = localScreen.getScreenSize();
    setLocation((screenDimension.width / 2 - width / 2), (screenDimension.height / 2 - height / 2));

    initComponents();

  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel_Main = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel_Main.setBackground(new java.awt.Color(252, 247, 255));

    javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
    jPanel_Main.setLayout(jPanel_MainLayout);
    jPanel_MainLayout.setHorizontalGroup(
        jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
    );
    jPanel_MainLayout.setVerticalGroup(
        jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel_Main;
  // End of variables declaration//GEN-END:variables
}
