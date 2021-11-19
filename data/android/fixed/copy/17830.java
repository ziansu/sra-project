public void addMessage(codeu.chat.common.Message message) {
    if (messages.contains(message)) {
        return ;
    }
    messages.add(message);
    if (isInitialized) {
        hasMessageModified = true;
    }
}