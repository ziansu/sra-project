public org.mobicents.media.server.io.network.channel.PacketHandler getHandler(byte[] packet) {
    synchronized(this.handlers) {
        for (org.mobicents.media.server.io.network.channel.PacketHandler protocolHandler : this.handlers) {
            if (protocolHandler.canHandle(packet)) {
                return protocolHandler;
            }
        }
        return null;
    }
}