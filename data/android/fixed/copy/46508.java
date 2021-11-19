public static boolean outsideCicle(int r, int x, int y) {
    double distance = (x * x) + (y * y);
    return distance >= (r * r);
}