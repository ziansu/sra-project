public void setAtPosition(long position, float value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfFloat));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putFloat(i, value);
}