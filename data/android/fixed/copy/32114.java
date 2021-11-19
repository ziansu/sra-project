public long sum() {
    long sum = 0L;
    for (java.lang.Integer n : count.values()) {
        sum += n;
    }
    return sum;
}