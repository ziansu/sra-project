private static double threshhold(double value, double min, double max) {
    return java.lang.Math.min(java.lang.Math.max(value, min), max);
}