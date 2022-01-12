@java.lang.Override
public void readDescPacket(io.netty.buffer.ByteBuf buf) {
    super.readDescPacket(buf);
    processTime = buf.readInt();
}