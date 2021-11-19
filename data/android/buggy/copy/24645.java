private tonivade.redis.protocol.SafeString readBytes(io.netty.buffer.ByteBuf buffer, int size) {
    tonivade.redis.protocol.SafeString safeString = new tonivade.redis.protocol.SafeString(buffer.readBytes(size).nioBuffer());
    buffer.skipBytes(2);
    checkpoint();
    return safeString;
}