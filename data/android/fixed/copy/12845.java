public void onSendButton(java.lang.String message) {
    if (message.equals(""))
        return ;
    
    client.sendMessage(message);
    clientGui.getMessageArea().setText("");
}