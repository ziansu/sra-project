public static void Real(float x, int n) {
    if (n <= 0) {
        java.lang.System.out.print(x);
    }else {
        java.lang.System.out.printf((("%" + n) + "f"), x);
    }
}