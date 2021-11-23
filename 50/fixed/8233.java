public void setAtPosition(long position, int value) {
    ensure(position);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putInt(((pointer) + position), value);
}