private void resetCalculator() {
    backLine.setText(" ");
    operatorLine.setText(" ");
    mainLine.setText(getResources().getText(R.string.default_value));
    decimalAdded = false;
    operationPerformed = false;
}