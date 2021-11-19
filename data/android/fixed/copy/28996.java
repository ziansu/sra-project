private static int rand() {
    int color = ((int) (java.lang.Math.round((256 * (java.lang.Math.random())))));
    return color > 230 ? 230 : color;
}