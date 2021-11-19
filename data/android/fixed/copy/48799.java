public void send(java.lang.String mesageOut) {
    chatTCP.ChatTCPImpl.chatHistory += mesageOut + "\n";
    chatTCP.ChatTCPImpl.toDelivery += mesageOut + "\n";
}