public void increaseInterval() {
    int current = java.lang.Integer.parseInt(intervalText.getText());
    if (current < 10) {
        current++;
        switchDelay = current * 1000;
        intervalText.setText(java.lang.String.valueOf(current));
    }
}