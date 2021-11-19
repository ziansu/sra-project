public void setMessages(java.util.Collection<java.lang.String> messages) {
    this.messages = new java.util.ArrayList<>(messages);
    notifyDataSetInvalidated();
}