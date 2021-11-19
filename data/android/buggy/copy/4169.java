public org.mobicents.media.server.io.network.channel.PacketHandler getHandler(byte[] packet) {
    for (org.mobicents.media.server.io.network.channel.PacketHandler protocolHandler : this.handlers) {
        if (protocolHandler.canHandle(packet)) {
            return protocolHandler;
        }
    }
    return null;
}