public synchronized int getValue() {
    reloadSize();
    return value;
}