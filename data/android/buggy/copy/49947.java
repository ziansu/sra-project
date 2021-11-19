public void setWebsocketChannel(org.jboss.netty.channel.Channel websocketChannel) {
    this.websocketChannel = websocketChannel;
    websocketChannel.setAttachment(socketChannel);
    socketChannel.setAttachment(this);
}