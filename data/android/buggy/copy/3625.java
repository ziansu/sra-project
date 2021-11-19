private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
    calc.CalcUI.calcInput = (calc.CalcUI.calcInput) + "3";
    calc.CalcUI.calcOutput = (calc.CalcUI.calcOutput) + "3";
    txfResult.setText(calc.CalcUI.calcOutput);
    calc.CalcUI.result = java.lang.Double.parseDouble(calc.CalcUI.calcOutput);
}