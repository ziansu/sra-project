public void setAtPosition(long position, byte value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putByte(((pointer) + position), value);
}