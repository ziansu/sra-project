private void destroyPacket(io.netty.buffer.ByteBuf packet) {
    packet.release();
}