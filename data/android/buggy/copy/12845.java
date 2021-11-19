public void onSendButton(java.lang.String message) {
    client.sendMessage(message);
    clientGui.getMessageArea().setText("");
}