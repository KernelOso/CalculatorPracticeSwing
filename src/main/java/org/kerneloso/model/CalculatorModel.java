package org.kerneloso.model;

public class CalculatorModel {

  private String operandCache;
  private String operandScreen;
  private String operator;
  private boolean isResolved;
  private boolean isScreenFull;

  public CalculatorModel() {

    resetModel();

  }

  public void resetModel() {

    this.operandScreen = "0";
    this.operandCache = "";
    this.operator = "";
    this.isResolved = false;
    this.isScreenFull = false;

  }

  public void operate() {

    float temp = 0;

    switch (operator) {
      case ("+") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operandCache) + Float.parseFloat(operandScreen));
      }
      case ("-") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operandCache) - Float.parseFloat(operandScreen));
      }
      case ("*") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operandCache) * Float.parseFloat(operandScreen));
      }
      case ("/") -> {
        this.isResolved = true;
        temp = (Float.parseFloat(operandCache) / Float.parseFloat(operandScreen));
      }

      default -> temp = Float.parseFloat(operandScreen);
    }

    if (temp == (int) temp) {

      operandCache = "";
      operator = "";
      operandScreen = String.valueOf((int) temp);

    } else {

      operandCache = "";
      operator = "";
      operandScreen = String.valueOf(temp);

    }

  }

  public String getOperandCache() {
    return operandCache;
  }

  public String getOperandScreen() {
    return operandScreen;
  }

  public String getOperator() {
    return operator;
  }

  public boolean isScreenFull() {
    return isScreenFull;
  }

  public boolean isResolved() {
    return isResolved;
  }


  //Setters
  public void setOperandCache(String operandCache) {
    this.operandCache = operandCache;
  }

  public void setOperator(String operator) {

    operandCache = operandScreen;
    operandScreen = "0";

    this.operator = operator;
  }

  public void setOperandScreen(String operandScreen) {

    if (operandScreen.length() > 12) {

      this.operandScreen = operandScreen.substring(0, 12);

    } else {

      this.operandScreen = operandScreen;

    }

  }

  public void setResolved(boolean resolved) {
    isResolved = resolved;
  }

  public void setScreenFull(boolean screenFull) {
    isScreenFull = screenFull;
  }
}
