public synchronized void setText(java.lang.String message) {
    java.lang.System.out.println((("setText called : " + (chatHistory.getText())) + message));
    chatHistory.setText(((chatHistory.getText()) + message));
}