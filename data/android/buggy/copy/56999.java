public void trim() {
    com.heerbann.unsafe.UnsafeBuffer.unsafe.reallocateMemory(pointer, position);
    capacity = position;
}