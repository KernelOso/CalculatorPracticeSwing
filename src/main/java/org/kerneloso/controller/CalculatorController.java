package org.kerneloso.controller;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.kerneloso.view.CalculatorView;
import org.kerneloso.view.Colors;

public class CalculatorController {

  private CalculatorView view;

  public CalculatorController() {

    this.view = new CalculatorView(this);
    view.setVisible(true);

  }

  //Input Events
  public void numberPressed(java.awt.event.MouseEvent evt) {

    JLabel label = (JLabel) evt.getSource();
    String input = label.getText();

    String current = view.getScreen().getText();

    String updated = (current.length() < 12)
        ? (current.equals("0"))? input : current + input
        : current;

    updateScreen(updated);

  }

  private void updateScreen(String input){

    input = (input.length() >12)
        ? input.substring(0,11)
        : input ;

    view.getFullAdvice().setEnabled(input.length() >= 12);

    view.setScreenText(input);
  }

  //Color Events
  public void flashSpecialPanels(JPanel panel) {
    panel.setBackground(Colors.SPECIAL_FLASH);
  }

  public void highlightSpecialPanels(JPanel panel) {
    panel.setBackground(Colors.SPECIAL_LIGHT);
  }

  public void restoreSpecialPanelsColor(JPanel panel) {
    panel.setBackground(Colors.SPECIAL_DARK);
  }

  public void flashPanels(JPanel panel) {
    panel.setBackground(Colors.FOREGROUND_FLASH);
  }

  public void highlightPanels(JPanel panel) {
    panel.setBackground(Colors.FOREGROUND_LIGHT);
  }

  public void restorePanelsColor(JPanel panel) {
    panel.setBackground(Colors.FOREGROUND_DARK);
  }

}
