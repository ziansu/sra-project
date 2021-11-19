public void setAll(int capacity, T value) {
    ensureCapacity0(capacity);
    pos = capacity;
    java.util.Arrays.fill(buffer, value);
}