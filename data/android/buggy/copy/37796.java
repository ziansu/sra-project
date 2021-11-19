public long getValue() {
    int numValues = values.count();
    if (numValues == 0) {
        return 0L;
    }
    return values.valueAt(0);
}