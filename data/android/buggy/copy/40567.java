void setOperator(java.lang.String s) {
    operationIndicator = s;
    if (resultFlag) {
        display.setDisplay(operationIndicator, operandTwo);
        operandOne = result;
    }else {
        display.setDisplay(operandOne, operationIndicator, operandTwo);
    }
}