public void increaseInterval() {
    int current = java.lang.Integer.parseInt(intervalText.getText());
    if (current < 10) {
        current++;
        intervalText.setText(java.lang.String.valueOf(current));
    }
}