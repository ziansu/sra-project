private static boolean overlap(long min0, long max0, long min1, long max1) {
    return (min0 <= max1) && (max0 >= min1);
}