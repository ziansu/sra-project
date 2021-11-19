public void setAtPosition(long position, short value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfShort));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putShort(i, value);
}