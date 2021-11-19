private int generateDuration(int min, int max) {
    if (max == 0) {
        return min;
    }
    return min + (random.nextInt(max));
}