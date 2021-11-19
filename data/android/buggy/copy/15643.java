@java.lang.Override
protected void handleTextMessage(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.TextMessage textMessage) throws java.lang.Exception {
    java.lang.System.out.println(("Message received: " + (textMessage.getPayload())));
}