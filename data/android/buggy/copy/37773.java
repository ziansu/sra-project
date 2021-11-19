public static void toChangeSign() {
    com.faa1192.calc.Calc.curInput = com.faa1192.calc.Calc.curInput.multiply(new java.math.BigDecimal((-1)));
    com.faa1192.calc.Calc.resultField.setText(com.faa1192.calc.Calc.curInput.toString());
    com.faa1192.calc.Calc.refreshInput();
}