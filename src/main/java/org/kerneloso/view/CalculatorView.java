package org.kerneloso.view;

import javax.swing.JFrame;

public class CalculatorView extends JFrame {

  public CalculatorView() {

    setBounds( 500 , 300 , 800 , 600);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Calculator Swing");

  }

}
