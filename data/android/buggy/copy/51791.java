public void upPressed() {
    (selectedOption)--;
    selectedOption %= options.size();
    selectedOption = java.lang.Math.abs(selectedOption);
}