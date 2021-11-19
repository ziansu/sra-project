public void setAll(int capacity, int value) {
    ensureCapacity0(capacity);
    pos = capacity;
    java.util.Arrays.fill(buffer, value);
}