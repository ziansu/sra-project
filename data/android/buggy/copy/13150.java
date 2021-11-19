public static double ceilHack(double val) {
    double vfloored = ((int) (val));
    if (vfloored != val) {
        return val + 1;
    }
    return val;
}