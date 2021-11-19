public static int diffInMins(long start, long end) {
    int diff = ((int) ((end - start) / 1000)) / 60;
    return diff;
}