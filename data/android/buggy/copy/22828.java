public com.valleycampus.zigbee.io.ByteBuffer put(byte[] src) {
    java.lang.System.arraycopy(src, offset, buffer, ((offset) + (getPosition())), src.length);
    skip(src.length);
    return this;
}