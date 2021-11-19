public static double standardize(double value, double ave, double sd) {
    if (sd == 0.0) {
        return value;
    }
    return (value - ave) / sd;
}