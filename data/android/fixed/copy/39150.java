public void setMessages(java.util.List<com.example.htrip3.Message> messages) {
    this.messages.clear();
    if (messages != null) {
        this.messages.addAll(messages);
    }
}