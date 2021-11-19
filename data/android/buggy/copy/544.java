public void setAtPosition(long position, byte value) {
    long i = (pointer) + position;
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putByte(i, value);
}