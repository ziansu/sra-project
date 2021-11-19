private void chislo(java.lang.String s) {
    if ((calc.Calc.str) == "0") {
        calc.Calc.str = s;
    }else {
        calc.Calc.str += s;
    }
    this.inputField.setText(calc.Calc.str);
}