private void saveChat() throws java.io.IOException {
    if ((chat) == null) {
        throw new java.lang.IllegalStateException("No chat has been started");
    }
    guard.setChat(chat);
}