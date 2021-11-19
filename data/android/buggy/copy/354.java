@java.lang.Override
public byte[] innerToBytes() {
    java.nio.ByteBuffer b;
    byte[] ba = this.clientAddress.getAddress();
    b = java.nio.ByteBuffer.allocate(ba.length);
    b.put(ba);
    return b.array();
}