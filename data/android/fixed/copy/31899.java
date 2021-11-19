public void decreaseInterval() {
    int current = java.lang.Integer.parseInt(intervalText.getText());
    if (current > 2) {
        current--;
        intervalText.setText(java.lang.String.valueOf(current));
    }
}