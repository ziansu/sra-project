public void processInputedMessage() {
    if ((consoleListener) != null) {
        java.lang.String text = textField.getText();
        consoleListener.processInputMessage(text, this);
    }
    textField.setText("");
}