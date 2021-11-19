private void discardMessage(org.springframework.messaging.Message<?> message) {
    org.springframework.messaging.MessageChannel discardChannel = getDiscardChannel();
    this.messagingTemplate.send(discardChannel, message);
}