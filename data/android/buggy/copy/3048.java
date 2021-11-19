public void writeByte(byte data) throws java.lang.RuntimeException {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(new byte[]{ data });
    buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    device.write(buffer);
}