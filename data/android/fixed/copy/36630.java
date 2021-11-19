private long getAverageElapsedTime() {
    long total = 0;
    for (java.lang.Long t : times) {
        total += t;
    }
    return total / (times.size());
}