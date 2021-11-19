public void appendMessage(java.lang.String username, java.util.Date date, java.lang.String message) {
    appendMessage(new com.lynn9388.rmichatroom.rmi.Message(username, this.username, date, message));
}