private long getAverageElapsedTime() {
    long total = 0;
    for (java.lang.Long t : times) {
        total += t;
    }
    long average = total / (times.size());
    return average;
}