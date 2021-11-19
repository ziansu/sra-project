protected org.springframework.messaging.Message<java.lang.String> createMessage(java.lang.String destination, java.lang.String payload) {
    org.springframework.messaging.simp.SimpMessageHeaderAccessor headers = org.springframework.messaging.simp.SimpMessageHeaderAccessor.create(SimpMessageType.MESSAGE);
    headers.setDestination(destination);
    return org.springframework.messaging.support.MessageBuilder.createMessage("", headers.getMessageHeaders());
}