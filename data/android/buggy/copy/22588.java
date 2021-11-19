public static double safeSubtract(double d1, final double d2) {
    d1 = -d1;
    return com.asher_stern.crf.utilities.DoubleUtilities.safeAdd(d1, d2);
}