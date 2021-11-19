public synchronized boolean has(int expectedNumOfIds) {
    return ((available) >= expectedNumOfIds) && (expectedNumOfIds != 0);
}