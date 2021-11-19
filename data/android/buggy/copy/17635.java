public void setAtPosition(long position, long value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfLong));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putLong(i, value);
}