protected void writeToData(sas.systems.imflux.packet.DataPacket packet, java.net.SocketAddress destination) {
    final io.netty.channel.AddressedEnvelope<sas.systems.imflux.packet.DataPacket, java.net.SocketAddress> envelope = new io.netty.channel.DefaultAddressedEnvelope<sas.systems.imflux.packet.DataPacket, java.net.SocketAddress>(packet, destination);
    this.dataChannel.writeAndFlush(envelope);
}