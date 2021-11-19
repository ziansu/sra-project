public static double normalize(double value, double min, double max) {
    if (min == max) {
        return value;
    }
    return (value - min) / (max - min);
}