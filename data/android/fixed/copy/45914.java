private void focusButton() {
    mainButton.setEnabled(true);
    getRootPane().setDefaultButton(mainButton);
    mainButton.requestFocus();
}