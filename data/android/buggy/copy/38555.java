public void inboundMessage(TeamOrange.instantmessenger.models.AppMucMessage message) {
    messages.add(message);
    messageEvent.getMUC(this);
}