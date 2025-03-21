package org.kerneloso.model;

public class CalculatorModel {

  private String operand;
  private String operator;
  private boolean isResolved;

  public CalculatorModel() {

    this.operand = "";
    this.operator = "";
    this.isResolved = false;

  }

  public String getOperand() {
    return operand;
  }

  public boolean isResolved() {
    return isResolved;
  }

  public void setOperand(String operand) {
    this.operand = operand;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public void setResolved(boolean resolved) {
    isResolved = resolved;
  }

  public String operate(String input) {

    float temp = 0;

    switch (operator) {
      case ("+") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operand) + Float.parseFloat(input));
      }
      case ("-") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operand) - Float.parseFloat(input));
      }
      case ("*") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operand) * Float.parseFloat(input));
      }
      case ("/") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operand) / Float.parseFloat(input));
      }
    };

    if (temp == (int) temp) {

      return String.valueOf((int) temp);

    } else {

      return String.valueOf(temp);

    }

  }

}
