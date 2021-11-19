public void setValue(double multiplierValue) {
    this.multiplierValue = multiplierValue;
    java.lang.String formattedValue = getFormattedValue(multiplierValue);
    this.value.setText(formattedValue);
}