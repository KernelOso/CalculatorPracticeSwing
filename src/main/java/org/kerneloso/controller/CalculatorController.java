package org.kerneloso.controller;

import java.awt.Color;
import javax.swing.JPanel;
import org.kerneloso.view.CalculatorView;

public class CalculatorController {

  private CalculatorView view;

  public CalculatorController() {

    this.view = new CalculatorView(this);
    view.setVisible(true);

  }

  public void changePanelColor(java.awt.event.MouseEvent evt, Color color) {
    JPanel panel = (JPanel) evt.getSource();
    panel.setBackground(color);
  }

  public void numberPressed(String number) {

    String current = view.getScreen().getText();

    String updated = (current.length() < 12)
        ? (current.equals("0"))? current : current + number
        : current;

    view.setScreenText(updated);
    view.getFullAdvice().setEnabled(updated.length() == 12);

  }

}
