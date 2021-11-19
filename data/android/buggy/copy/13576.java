public void disconnect(boolean isClientListenerClosed, java.lang.String name) {
    chat.server.Message systemMessage;
    if (isClientListenerClosed) {
        systemMessage = new chat.server.Message(200);
    }else {
        systemMessage = new chat.server.Message(300);
    }
    addMessage(systemMessage);
}