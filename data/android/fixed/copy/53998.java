private void zero() {
    if (!("0".equals(calc.Calc.str))) {
        calc.Calc.str += "0";
    }
    this.inputField.setText(calc.Calc.str);
}