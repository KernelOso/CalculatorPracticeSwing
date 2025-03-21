package org.kerneloso.controller;

import javax.swing.JLabel;
import javax.swing.JPanel;
import org.kerneloso.model.CalculatorModel;
import org.kerneloso.view.CalculatorView;
import org.kerneloso.view.Colors;

public class CalculatorController {

  private final CalculatorView view;
  private final CalculatorModel model;

  public CalculatorController() {

    this.view = new CalculatorView(this);
    view.setVisible(true);

    this.model = new CalculatorModel();
    refreshView();

  }

  //Input Events
  public void resetPressed() {

    model.resetModel();
    refreshView();

  }

  public void digitPressed(java.awt.event.MouseEvent evt) {

    resetModelWhenResolved();

    String current = model.getOperandScreen();
    String input = getLabelText(evt);
    String updated =
        (current.equals("0"))
            ? (input.equals("."))
              ? current + input
              : input
            : (current.contains(".") && input.equals("."))
                ? current
                : current + input;

    model.setOperandScreen(updated);

    refreshView();

  }

  public void operatorPressed(java.awt.event.MouseEvent evt) {

    String input = getLabelText(evt);

    model.setOperator(input);
    refreshView();

  }

  public void erasePressed() {

    resetModelWhenResolved();

    String current = model.getOperandScreen();
    String updated =
        (current.length() == 1)
            ? "0"
            : current.substring(0, current.length() - 1);

    model.setOperandScreen(updated);
    refreshView();

  }

  public void resultPressed() {

    if (!model.getOperandCache().isEmpty()) {

      model.operate();

    }

    refreshView();

  }

  //Model-View Logic
  private void refreshView() {

    view.setOperandText(model.getOperandCache());
    view.setOperatorText(model.getOperator());
    view.getFullAdvice().setEnabled(model.isScreenFull());
    view.setScreenText(model.getOperandScreen());

  }

  private void resetModelWhenResolved() {

    if (model.isResolved()) {
      model.resetModel();
    }

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
