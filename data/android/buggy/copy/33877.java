@java.lang.Override
public tonivade.redis.protocol.SafeString readString(int size) {
    return this.readBytes(buffer, size);
}