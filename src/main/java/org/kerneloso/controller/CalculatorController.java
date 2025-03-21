package org.kerneloso.controller;

import javax.swing.JLabel;
import javax.swing.JPanel;
import org.kerneloso.model.CalculatorModel;
import org.kerneloso.view.CalculatorView;
import org.kerneloso.view.Colors;

public class CalculatorController {

  private CalculatorView view;
  private CalculatorModel model;

  public CalculatorController() {

    this.view = new CalculatorView(this);
    view.setVisible(true);

    this.model = new CalculatorModel();

  }

  //Input Events

  public void resetPressed() {

    updateOperator("");
    updateOperand("");

    updateScreen("0");

  }

  public void resultPressed() {

    if (!model.getOperand().isEmpty()) {

      updateScreen(model.operate(view.getScreen().getText()));

    }

    if (model.isResolved()) {
      updateOperator("");
      updateOperand("");
    }

  }

  public void erasePressed() {

    String text = view.getScreen().getText();
    text = (text.length() == 1)
        ? text = "0"
        : text.substring(0, text.length() - 1);

    updateScreen(text);

  }

  public void operatorPressed(java.awt.event.MouseEvent evt) {

    String input = getLabelText(evt);

    updateOperator(input);
    updateOperand(view.getScreen().getText());

    updateScreen("0");
  }

  private void updateOperand(String operand) {

    model.setOperand(operand);
    view.setOperandText(operand);
  }

  private void updateOperator(String operator) {
    model.setOperator(operator);
    view.setOperatorText(operator);
  }

  public void numberPressed(java.awt.event.MouseEvent evt) {

    if (model.isResolved()) {
      updateScreen("0");
      model.setResolved(false);
    }

    String input = getLabelText(evt);

    String current = view.getScreen().getText();

    String updated = (current.length() < 12)
        ? (current.equals("0"))
        ? input : current + input
        : current;

    updateScreen(updated);

  }

  private void updateScreen(String input) {

    input = (input.length() > 12)
        ? input.substring(0, 11)
        : input;

    view.getFullAdvice().setEnabled(input.length() >= 12);

    view.setScreenText(input);
  }

  private String getLabelText(java.awt.event.MouseEvent evt) {

    JLabel label = (JLabel) evt.getSource();
    return label.getText();

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
