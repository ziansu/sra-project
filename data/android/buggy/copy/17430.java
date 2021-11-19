public static float getStoragePercentage(long bytesAmount, long bytesTotal) {
    return ((float) (java.lang.Math.ceil(((((double) (bytesAmount)) / ((double) (bytesTotal))) * 100))));
}