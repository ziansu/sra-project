public static int convert(int amount, float factorFrom, float factorTo) {
    return ((int) (java.lang.Math.floor((amount / (factorFrom / factorTo)))));
}