public static java.lang.String readString(io.netty.buffer.ByteBuf buf) {
    int length = buf.readUnsignedShort();
    return new java.lang.String(buf.readBytes((length * 2)).array(), java.nio.charset.StandardCharsets.UTF_16BE);
}