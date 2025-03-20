
package org.kerneloso.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorView extends JFrame {

  public CalculatorView() {

    initComponents();

    setResizable(false);
    setTitle("Calculator Swing");
    Toolkit localScreen = Toolkit.getDefaultToolkit();
    Dimension screenDimension = localScreen.getScreenSize();
    setLocation((screenDimension.width / 2 - this.getWidth() / 2),
        (screenDimension.height / 2 - this.getHeight() / 2));

  }

  private void flashSpecialPanels(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.SPECIAL_FLASH);
  }

  private void highlightSpecialPanels(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.SPECIAL_LIGHT);
  }

  private void restoreSpecialPanelsColor(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.SPECIAL_DARK);
  }

  private void flashPanels(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.FOREGROUND_FLASH);
  }

  private void highlightPanels(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.FOREGROUND_LIGHT);
  }

  private void restorePanelsColor(java.awt.event.MouseEvent evt) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(Colors.FOREGROUND_DARK);
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanelMain = new javax.swing.JPanel();
    jPanelScreen = new javax.swing.JPanel();
    jLabelScreen = new javax.swing.JLabel();
    jPanelResultButton = new javax.swing.JPanel();
    jLabelResultButton = new javax.swing.JLabel();
    jPanelCButton = new javax.swing.JPanel();
    jLabelCButton = new javax.swing.JLabel();
    jPanelDivisionButton = new javax.swing.JPanel();
    jLabelDivisionButton = new javax.swing.JLabel();
    jPanelMultiplicationButton = new javax.swing.JPanel();
    jLabelMultiplicationButton = new javax.swing.JLabel();
    jPanelEraseButton = new javax.swing.JPanel();
    jLabelEraseButton = new javax.swing.JLabel();
    jPanelMinusButton = new javax.swing.JPanel();
    jLabelMinusButton = new javax.swing.JLabel();
    jPanelPlusButton = new javax.swing.JPanel();
    jLabelPlusButton = new javax.swing.JLabel();
    jPanelDotButton = new javax.swing.JPanel();
    jLabelDotButton = new javax.swing.JLabel();
    jPanelPercentageButton = new javax.swing.JPanel();
    jLabelPercentageButton = new javax.swing.JLabel();
    jPanel9Button = new javax.swing.JPanel();
    jLabel9Button = new javax.swing.JLabel();
    jPanel8Button = new javax.swing.JPanel();
    jLabel8Button = new javax.swing.JLabel();
    jPanel7Button = new javax.swing.JPanel();
    jLabel7Button = new javax.swing.JLabel();
    jPanel6Button = new javax.swing.JPanel();
    jLabel6Button = new javax.swing.JLabel();
    jPanel5Button = new javax.swing.JPanel();
    jLabel5Button = new javax.swing.JLabel();
    jPanel4Button = new javax.swing.JPanel();
    jLabel4Button = new javax.swing.JLabel();
    jPanel3Button = new javax.swing.JPanel();
    jLabel3Button = new javax.swing.JLabel();
    jPanel2Button = new javax.swing.JPanel();
    jLabel2Button = new javax.swing.JLabel();
    jPanel1Button = new javax.swing.JPanel();
    jLabel1Button = new javax.swing.JLabel();
    jPanel0Button = new javax.swing.JPanel();
    jLabel9Button9 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanelMain.setBackground(new java.awt.Color(252, 247, 255));

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
                .addComponent(jLabelScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
    );
    jPanelScreenLayout.setVerticalGroup(
        jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelScreen, javax.swing.GroupLayout.Alignment.TRAILING,
                javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
    );

    jPanelResultButton.setBackground(new java.awt.Color(101, 85, 96));
    jPanelResultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelResultButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightSpecialPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restoreSpecialPanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashSpecialPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightSpecialPanels(evt);
      }
    });

    jLabelResultButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelResultButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelResultButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelResultButton.setText("=");

    javax.swing.GroupLayout jPanelResultButtonLayout = new javax.swing.GroupLayout(
        jPanelResultButton);
    jPanelResultButton.setLayout(jPanelResultButtonLayout);
    jPanelResultButtonLayout.setHorizontalGroup(
        jPanelResultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelResultButtonLayout.setVerticalGroup(
        jPanelResultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178,
                Short.MAX_VALUE)
    );

    jPanelCButton.setBackground(new java.awt.Color(101, 85, 96));
    jPanelCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelCButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightSpecialPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restoreSpecialPanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashSpecialPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightSpecialPanels(evt);
      }
    });

    jLabelCButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelCButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelCButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelCButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelCButton.setText("C");

    javax.swing.GroupLayout jPanelCButtonLayout = new javax.swing.GroupLayout(jPanelCButton);
    jPanelCButton.setLayout(jPanelCButtonLayout);
    jPanelCButtonLayout.setHorizontalGroup(
        jPanelCButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanelCButtonLayout.setVerticalGroup(
        jPanelCButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanelDivisionButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelDivisionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelDivisionButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelDivisionButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelDivisionButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelDivisionButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelDivisionButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelDivisionButton.setText("/");

    javax.swing.GroupLayout jPanelDivisionButtonLayout = new javax.swing.GroupLayout(
        jPanelDivisionButton);
    jPanelDivisionButton.setLayout(jPanelDivisionButtonLayout);
    jPanelDivisionButtonLayout.setHorizontalGroup(
        jPanelDivisionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDivisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelDivisionButtonLayout.setVerticalGroup(
        jPanelDivisionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDivisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelMultiplicationButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelMultiplicationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelMultiplicationButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelMultiplicationButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelMultiplicationButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelMultiplicationButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelMultiplicationButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelMultiplicationButton.setText("*");

    javax.swing.GroupLayout jPanelMultiplicationButtonLayout = new javax.swing.GroupLayout(
        jPanelMultiplicationButton);
    jPanelMultiplicationButton.setLayout(jPanelMultiplicationButtonLayout);
    jPanelMultiplicationButtonLayout.setHorizontalGroup(
        jPanelMultiplicationButtonLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMultiplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelMultiplicationButtonLayout.setVerticalGroup(
        jPanelMultiplicationButtonLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMultiplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelEraseButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelEraseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelEraseButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelEraseButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelEraseButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelEraseButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelEraseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelEraseButton.setText("<-");

    javax.swing.GroupLayout jPanelEraseButtonLayout = new javax.swing.GroupLayout(
        jPanelEraseButton);
    jPanelEraseButton.setLayout(jPanelEraseButtonLayout);
    jPanelEraseButtonLayout.setHorizontalGroup(
        jPanelEraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEraseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelEraseButtonLayout.setVerticalGroup(
        jPanelEraseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEraseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelMinusButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelMinusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelMinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelMinusButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelMinusButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelMinusButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelMinusButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelMinusButton.setText("-");

    javax.swing.GroupLayout jPanelMinusButtonLayout = new javax.swing.GroupLayout(
        jPanelMinusButton);
    jPanelMinusButton.setLayout(jPanelMinusButtonLayout);
    jPanelMinusButtonLayout.setHorizontalGroup(
        jPanelMinusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelMinusButtonLayout.setVerticalGroup(
        jPanelMinusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelPlusButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelPlusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelPlusButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelPlusButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelPlusButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelPlusButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelPlusButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelPlusButton.setText("+");

    javax.swing.GroupLayout jPanelPlusButtonLayout = new javax.swing.GroupLayout(jPanelPlusButton);
    jPanelPlusButton.setLayout(jPanelPlusButtonLayout);
    jPanelPlusButtonLayout.setHorizontalGroup(
        jPanelPlusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelPlusButtonLayout.setVerticalGroup(
        jPanelPlusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelDotButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelDotButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelDotButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelDotButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelDotButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelDotButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelDotButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelDotButton.setText(".");

    javax.swing.GroupLayout jPanelDotButtonLayout = new javax.swing.GroupLayout(jPanelDotButton);
    jPanelDotButton.setLayout(jPanelDotButtonLayout);
    jPanelDotButtonLayout.setHorizontalGroup(
        jPanelDotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDotButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelDotButtonLayout.setVerticalGroup(
        jPanelDotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDotButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanelPercentageButton.setBackground(new java.awt.Color(135, 140, 143));
    jPanelPercentageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanelPercentageButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabelPercentageButton.setBackground(new java.awt.Color(0, 0, 0));
    jLabelPercentageButton.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabelPercentageButton.setForeground(new java.awt.Color(0, 0, 0));
    jLabelPercentageButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelPercentageButton.setText("%");

    javax.swing.GroupLayout jPanelPercentageButtonLayout = new javax.swing.GroupLayout(
        jPanelPercentageButton);
    jPanelPercentageButton.setLayout(jPanelPercentageButtonLayout);
    jPanelPercentageButtonLayout.setHorizontalGroup(
        jPanelPercentageButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPercentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );
    jPanelPercentageButtonLayout.setVerticalGroup(
        jPanelPercentageButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPercentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
                Short.MAX_VALUE)
    );

    jPanel9Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel9Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel9Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel9Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel9Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel9Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9Button.setText("9");

    javax.swing.GroupLayout jPanel9ButtonLayout = new javax.swing.GroupLayout(jPanel9Button);
    jPanel9Button.setLayout(jPanel9ButtonLayout);
    jPanel9ButtonLayout.setHorizontalGroup(
        jPanel9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel9ButtonLayout.setVerticalGroup(
        jPanel9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel8Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel8Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel8Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel8Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel8Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel8Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel8Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8Button.setText("8");

    javax.swing.GroupLayout jPanel8ButtonLayout = new javax.swing.GroupLayout(jPanel8Button);
    jPanel8Button.setLayout(jPanel8ButtonLayout);
    jPanel8ButtonLayout.setHorizontalGroup(
        jPanel8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel8ButtonLayout.setVerticalGroup(
        jPanel8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel7Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel7Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel7Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel7Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel7Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel7Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel7Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7Button.setText("7");

    javax.swing.GroupLayout jPanel7ButtonLayout = new javax.swing.GroupLayout(jPanel7Button);
    jPanel7Button.setLayout(jPanel7ButtonLayout);
    jPanel7ButtonLayout.setHorizontalGroup(
        jPanel7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel7ButtonLayout.setVerticalGroup(
        jPanel7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel6Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel6Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel6Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel6Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel6Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel6Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6Button.setText("6");

    javax.swing.GroupLayout jPanel6ButtonLayout = new javax.swing.GroupLayout(jPanel6Button);
    jPanel6Button.setLayout(jPanel6ButtonLayout);
    jPanel6ButtonLayout.setHorizontalGroup(
        jPanel6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel6ButtonLayout.setVerticalGroup(
        jPanel6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel5Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel5Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel5Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel5Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel5Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel5Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5Button.setText("5");

    javax.swing.GroupLayout jPanel5ButtonLayout = new javax.swing.GroupLayout(jPanel5Button);
    jPanel5Button.setLayout(jPanel5ButtonLayout);
    jPanel5ButtonLayout.setHorizontalGroup(
        jPanel5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel5ButtonLayout.setVerticalGroup(
        jPanel5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel4Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel4Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel4Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel4Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel4Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel4Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4Button.setText("4");

    javax.swing.GroupLayout jPanel4ButtonLayout = new javax.swing.GroupLayout(jPanel4Button);
    jPanel4Button.setLayout(jPanel4ButtonLayout);
    jPanel4ButtonLayout.setHorizontalGroup(
        jPanel4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel4ButtonLayout.setVerticalGroup(
        jPanel4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel3Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel3Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel3Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel3Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel3Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel3Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3Button.setText("3");

    javax.swing.GroupLayout jPanel3ButtonLayout = new javax.swing.GroupLayout(jPanel3Button);
    jPanel3Button.setLayout(jPanel3ButtonLayout);
    jPanel3ButtonLayout.setHorizontalGroup(
        jPanel3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel3ButtonLayout.setVerticalGroup(
        jPanel3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel2Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel2Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel2Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel2Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel2Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel2Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2Button.setText("2");

    javax.swing.GroupLayout jPanel2ButtonLayout = new javax.swing.GroupLayout(jPanel2Button);
    jPanel2Button.setLayout(jPanel2ButtonLayout);
    jPanel2ButtonLayout.setHorizontalGroup(
        jPanel2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel2ButtonLayout.setVerticalGroup(
        jPanel2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel1Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel1Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel1Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel1Button.setBackground(new java.awt.Color(0, 0, 0));
    jLabel1Button.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel1Button.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1Button.setText("1");

    javax.swing.GroupLayout jPanel1ButtonLayout = new javax.swing.GroupLayout(jPanel1Button);
    jPanel1Button.setLayout(jPanel1ButtonLayout);
    jPanel1ButtonLayout.setHorizontalGroup(
        jPanel1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel1ButtonLayout.setVerticalGroup(
        jPanel1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    jPanel0Button.setBackground(new java.awt.Color(135, 140, 143));
    jPanel0Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel0Button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        restorePanelsColor(evt);
      }

      public void mousePressed(java.awt.event.MouseEvent evt) {
        flashPanels(evt);
      }

      public void mouseReleased(java.awt.event.MouseEvent evt) {
        highlightPanels(evt);
      }
    });

    jLabel9Button9.setBackground(new java.awt.Color(0, 0, 0));
    jLabel9Button9.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
    jLabel9Button9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9Button9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9Button9.setText("0");

    javax.swing.GroupLayout jPanel0ButtonLayout = new javax.swing.GroupLayout(jPanel0Button);
    jPanel0Button.setLayout(jPanel0ButtonLayout);
    jPanel0ButtonLayout.setHorizontalGroup(
        jPanel0ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );
    jPanel0ButtonLayout.setVerticalGroup(
        jPanel0ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
    jPanelMain.setLayout(jPanelMainLayout);
    jPanelMainLayout.setHorizontalGroup(
        jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(
                    jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGroup(jPanelMainLayout.createParallelGroup(
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
                            .addGroup(jPanelMainLayout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelMainLayout.createSequentialGroup()
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
                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                    .addGroup(jPanelMainLayout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelMainLayout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanelMainLayout.createSequentialGroup()
                                                    .addComponent(jPanel5Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel6Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelMainLayout.createSequentialGroup()
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
                                                jPanelMainLayout.createSequentialGroup()
                                                    .addComponent(jPanel2Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel3Button,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanelMainLayout.createSequentialGroup()
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
                                    .addGroup(jPanelMainLayout.createParallelGroup(
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
                .addGap(20, 20, 20))
    );
    jPanelMainLayout.setVerticalGroup(
        jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelResultButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGroup(jPanelMainLayout.createParallelGroup(
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
                            .addGroup(jPanelMainLayout.createParallelGroup(
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
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1Button;
  private javax.swing.JLabel jLabel2Button;
  private javax.swing.JLabel jLabel3Button;
  private javax.swing.JLabel jLabel4Button;
  private javax.swing.JLabel jLabel5Button;
  private javax.swing.JLabel jLabel6Button;
  private javax.swing.JLabel jLabel7Button;
  private javax.swing.JLabel jLabel8Button;
  private javax.swing.JLabel jLabel9Button;
  private javax.swing.JLabel jLabel9Button9;
  private javax.swing.JLabel jLabelCButton;
  private javax.swing.JLabel jLabelDivisionButton;
  private javax.swing.JLabel jLabelDotButton;
  private javax.swing.JLabel jLabelEraseButton;
  private javax.swing.JLabel jLabelMinusButton;
  private javax.swing.JLabel jLabelMultiplicationButton;
  private javax.swing.JLabel jLabelPercentageButton;
  private javax.swing.JLabel jLabelPlusButton;
  private javax.swing.JLabel jLabelResultButton;
  private javax.swing.JLabel jLabelScreen;
  private javax.swing.JPanel jPanel0Button;
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
  private javax.swing.JPanel jPanelMain;
  private javax.swing.JPanel jPanelMinusButton;
  private javax.swing.JPanel jPanelMultiplicationButton;
  private javax.swing.JPanel jPanelPercentageButton;
  private javax.swing.JPanel jPanelPlusButton;
  private javax.swing.JPanel jPanelResultButton;
  private javax.swing.JPanel jPanelScreen;
  // End of variables declaration//GEN-END:variables
}
