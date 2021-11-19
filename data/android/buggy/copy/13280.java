@java.lang.Override
public com.germancoding.packetapi.PacketWriter prepare() throws java.io.IOException {
    com.germancoding.packetapi.PacketWriter data = new com.germancoding.packetapi.PacketWriter(getId());
    data.writeInt(handshakeID);
    data.write(protocolVersion);
    return data;
}