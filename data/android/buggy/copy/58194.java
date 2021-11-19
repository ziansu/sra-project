public void clearErrorMessage() {
    errorTextLabel.setText("");
    errorTextLabel.setToolTipText("");
    errorTextLabel.pack();
    errorMessageArea.setBackground(null);
    brandingArea.layout();
    brandingArea.update();
}