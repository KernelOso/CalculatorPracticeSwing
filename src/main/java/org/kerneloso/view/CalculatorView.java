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

    jPanel1 = new javax.swing.JPanel();
    jPanelScreen = new javax.swing.JPanel();
    jLabelScreen = new javax.swing.JLabel();
    jPanelDivisionButton = new javax.swing.JPanel();
    jPanelCButton = new javax.swing.JPanel();
    jPanelEraseButton = new javax.swing.JPanel();
    jPanelMultiplicationButton = new javax.swing.JPanel();
    jPanelMinusButton = new javax.swing.JPanel();
    jPanelPlusButton = new javax.swing.JPanel();
    jPanelResultButton = new javax.swing.JPanel();
    jPanelDotButton = new javax.swing.JPanel();
    jPanelPercentageButton = new javax.swing.JPanel();
    jPanel9Button = new javax.swing.JPanel();
    jPanel8Button = new javax.swing.JPanel();
    jPanel6Button = new javax.swing.JPanel();
    jPanel7Button = new javax.swing.JPanel();
    jPanel5Button = new javax.swing.JPanel();
    jPanel4Button = new javax.swing.JPanel();
    jPanel3Button = new javax.swing.JPanel();
    jPanel2Button = new javax.swing.JPanel();
    jPanel1Button = new javax.swing.JPanel();
    jPanel0Button = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(252, 247, 255));

    jPanelScreen.setBackground(new java.awt.Color(196, 202, 208));

    jLabelScreen.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
    jLabelScreen.setForeground(new java.awt.Color(0, 0, 0));
    jLabelScreen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelScreen.setText("0");

    javax.swing.GroupLayout jPanelScreenLayout = new javax.swing.GroupLayout(jPanelScreen);
    jPanelScreen.setLayout(jPanelScreenLayout);
    jPanelScreenLayout.setHorizontalGroup(
        jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 362,
                    Short.MAX_VALUE)
                .addContainerGap())
    );
    jPanelScreenLayout.setVerticalGroup(
        jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelScreen, javax.swing.GroupLayout.Alignment.TRAILING,
                javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
    );

    jPanelDivisionButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelDivisionButtonLayout = new javax.swing.GroupLayout(
        jPanelDivisionButton);
    jPanelDivisionButton.setLayout(jPanelDivisionButtonLayout);
    jPanelDivisionButtonLayout.setHorizontalGroup(
        jPanelDivisionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelDivisionButtonLayout.setVerticalGroup(
        jPanelDivisionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelCButton.setBackground(new java.awt.Color(101, 85, 96));

    javax.swing.GroupLayout jPanelCButtonLayout = new javax.swing.GroupLayout(jPanelCButton);
    jPanelCButton.setLayout(jPanelCButtonLayout);
    jPanelCButtonLayout.setHorizontalGroup(
        jPanelCButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelCButtonLayout.setVerticalGroup(
        jPanelCButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelEraseButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelEraseButtonLayout = new javax.swing.GroupLayout(
        jPanelEraseButton);
    jPanelEraseButton.setLayout(jPanelEraseButtonLayout);
    jPanelEraseButtonLayout.setHorizontalGroup(
        jPanelEraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelEraseButtonLayout.setVerticalGroup(
        jPanelEraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelMultiplicationButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelMultiplicationButtonLayout = new javax.swing.GroupLayout(
        jPanelMultiplicationButton);
    jPanelMultiplicationButton.setLayout(jPanelMultiplicationButtonLayout);
    jPanelMultiplicationButtonLayout.setHorizontalGroup(
        jPanelMultiplicationButtonLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelMultiplicationButtonLayout.setVerticalGroup(
        jPanelMultiplicationButtonLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelMinusButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelMinusButtonLayout = new javax.swing.GroupLayout(
        jPanelMinusButton);
    jPanelMinusButton.setLayout(jPanelMinusButtonLayout);
    jPanelMinusButtonLayout.setHorizontalGroup(
        jPanelMinusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelMinusButtonLayout.setVerticalGroup(
        jPanelMinusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelPlusButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelPlusButtonLayout = new javax.swing.GroupLayout(jPanelPlusButton);
    jPanelPlusButton.setLayout(jPanelPlusButtonLayout);
    jPanelPlusButtonLayout.setHorizontalGroup(
        jPanelPlusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelPlusButtonLayout.setVerticalGroup(
        jPanelPlusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelResultButton.setBackground(new java.awt.Color(101, 85, 96));

    javax.swing.GroupLayout jPanelResultButtonLayout = new javax.swing.GroupLayout(
        jPanelResultButton);
    jPanelResultButton.setLayout(jPanelResultButtonLayout);
    jPanelResultButtonLayout.setHorizontalGroup(
        jPanelResultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelResultButtonLayout.setVerticalGroup(
        jPanelResultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
    );

    jPanelDotButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelDotButtonLayout = new javax.swing.GroupLayout(jPanelDotButton);
    jPanelDotButton.setLayout(jPanelDotButtonLayout);
    jPanelDotButtonLayout.setHorizontalGroup(
        jPanelDotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelDotButtonLayout.setVerticalGroup(
        jPanelDotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanelPercentageButton.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanelPercentageButtonLayout = new javax.swing.GroupLayout(
        jPanelPercentageButton);
    jPanelPercentageButton.setLayout(jPanelPercentageButtonLayout);
    jPanelPercentageButtonLayout.setHorizontalGroup(
        jPanelPercentageButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanelPercentageButtonLayout.setVerticalGroup(
        jPanelPercentageButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel9Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel9ButtonLayout = new javax.swing.GroupLayout(jPanel9Button);
    jPanel9Button.setLayout(jPanel9ButtonLayout);
    jPanel9ButtonLayout.setHorizontalGroup(
        jPanel9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel9ButtonLayout.setVerticalGroup(
        jPanel9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel8Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel8ButtonLayout = new javax.swing.GroupLayout(jPanel8Button);
    jPanel8Button.setLayout(jPanel8ButtonLayout);
    jPanel8ButtonLayout.setHorizontalGroup(
        jPanel8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel8ButtonLayout.setVerticalGroup(
        jPanel8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel6Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel6ButtonLayout = new javax.swing.GroupLayout(jPanel6Button);
    jPanel6Button.setLayout(jPanel6ButtonLayout);
    jPanel6ButtonLayout.setHorizontalGroup(
        jPanel6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel6ButtonLayout.setVerticalGroup(
        jPanel6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel7Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel7ButtonLayout = new javax.swing.GroupLayout(jPanel7Button);
    jPanel7Button.setLayout(jPanel7ButtonLayout);
    jPanel7ButtonLayout.setHorizontalGroup(
        jPanel7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel7ButtonLayout.setVerticalGroup(
        jPanel7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel5Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel5ButtonLayout = new javax.swing.GroupLayout(jPanel5Button);
    jPanel5Button.setLayout(jPanel5ButtonLayout);
    jPanel5ButtonLayout.setHorizontalGroup(
        jPanel5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel5ButtonLayout.setVerticalGroup(
        jPanel5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel4Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel4ButtonLayout = new javax.swing.GroupLayout(jPanel4Button);
    jPanel4Button.setLayout(jPanel4ButtonLayout);
    jPanel4ButtonLayout.setHorizontalGroup(
        jPanel4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel4ButtonLayout.setVerticalGroup(
        jPanel4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel3Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel3ButtonLayout = new javax.swing.GroupLayout(jPanel3Button);
    jPanel3Button.setLayout(jPanel3ButtonLayout);
    jPanel3ButtonLayout.setHorizontalGroup(
        jPanel3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel3ButtonLayout.setVerticalGroup(
        jPanel3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel2Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel2ButtonLayout = new javax.swing.GroupLayout(jPanel2Button);
    jPanel2Button.setLayout(jPanel2ButtonLayout);
    jPanel2ButtonLayout.setHorizontalGroup(
        jPanel2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel2ButtonLayout.setVerticalGroup(
        jPanel2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel1Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel1ButtonLayout = new javax.swing.GroupLayout(jPanel1Button);
    jPanel1Button.setLayout(jPanel1ButtonLayout);
    jPanel1ButtonLayout.setHorizontalGroup(
        jPanel1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel1ButtonLayout.setVerticalGroup(
        jPanel1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    jPanel0Button.setBackground(new java.awt.Color(135, 140, 143));

    javax.swing.GroupLayout jPanel0ButtonLayout = new javax.swing.GroupLayout(jPanel0Button);
    jPanel0Button.setLayout(jPanel0ButtonLayout);
    jPanel0ButtonLayout.setHorizontalGroup(
        jPanel0ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );
    jPanel0ButtonLayout.setVerticalGroup(
        jPanel0ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanelCButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel7Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelPercentageButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanelDivisionButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanelMultiplicationButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanelEraseButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jPanel5Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel6Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel8Button,
                                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel9Button,
                                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jPanel2Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel3Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jPanel0Button,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jPanelDotButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelMinusButton,
                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelResultButton,
                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelPlusButton,
                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelCButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelDivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelEraseButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelMultiplicationButton,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel8Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelPlusButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelResultButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanelPercentageButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDotButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel0Button, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabelScreen;
  private javax.swing.JPanel jPanel0Button;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel1Button;
  private javax.swing.JPanel jPanel2Button;
  private javax.swing.JPanel jPanel3Button;
  private javax.swing.JPanel jPanel4Button;
  private javax.swing.JPanel jPanel5Button;
  private javax.swing.JPanel jPanel6Button;
  private javax.swing.JPanel jPanel7Button;
  private javax.swing.JPanel jPanel8Button;
  private javax.swing.JPanel jPanel9Button;
  private javax.swing.JPanel jPanelCButton;
  private javax.swing.JPanel jPanelDivisionButton;
  private javax.swing.JPanel jPanelDotButton;
  private javax.swing.JPanel jPanelEraseButton;
  private javax.swing.JPanel jPanelMinusButton;
  private javax.swing.JPanel jPanelMultiplicationButton;
  private javax.swing.JPanel jPanelPercentageButton;
  private javax.swing.JPanel jPanelPlusButton;
  private javax.swing.JPanel jPanelResultButton;
  private javax.swing.JPanel jPanelScreen;
  // End of variables declaration//GEN-END:variables
}
