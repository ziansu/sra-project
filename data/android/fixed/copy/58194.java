public void clearErrorMessage() {
    errorTextLabel.setText("");
    errorTextLabel.setToolTipText("");
    errorMessageArea.setBackground(null);
    brandingArea.layout();
    brandingArea.update();
}