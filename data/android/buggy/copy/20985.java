public double averageSpeed() {
    long c = super.get();
    if (c == 0) {
        return 0;
    }
    return ((double) (current)) / c;
}