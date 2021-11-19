public void register(com.lucadev.mcprotocol.protocol.State state, java.lang.Class<? extends com.lucadev.mcprotocol.protocol.packets.Packet> packet) {
    state.registerPacket(packet);
}