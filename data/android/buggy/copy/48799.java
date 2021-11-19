public void send(java.lang.String mesageOut, java.lang.String user) {
    chatTCP.ChatTCPImpl.chatHistory += (user + ": ") + mesageOut;
    chatTCP.ChatTCPImpl.toDelivery += (user + ": ") + mesageOut;
}