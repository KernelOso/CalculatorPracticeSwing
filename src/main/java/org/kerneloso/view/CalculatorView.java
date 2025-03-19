package org.kerneloso.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CalculatorView extends JFrame {

  public CalculatorView() {

    int width = 250;
    int height = 250;
    setSize(width,height);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Calculator Swing");

    //Set frame in the center of the screen
    Toolkit localScreen = Toolkit.getDefaultToolkit();
    Dimension screenDimension = localScreen.getScreenSize();
    setLocation((screenDimension.width/2 - width/2) , (screenDimension.height/2 - height/2));

  }

}
