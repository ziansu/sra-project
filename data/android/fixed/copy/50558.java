private void chislo(java.lang.String s) {
    if ("0".equals(calc.Calc.str)) {
        calc.Calc.str = s;
    }else {
        calc.Calc.str += s;
    }
    this.inputField.setText(calc.Calc.str);
}