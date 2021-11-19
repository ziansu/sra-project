protected boolean isWithinRange(long min, long max, long value) {
    return (value <= max) && (value >= min);
}