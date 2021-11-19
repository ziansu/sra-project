public void setAll(int capacity, int value) {
    ensureCapacity0(capacity);
    pos = 0;
    java.util.Arrays.fill(buffer, value);
}