public void setAtPosition(long position, char value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfChar));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putChar(i, value);
}