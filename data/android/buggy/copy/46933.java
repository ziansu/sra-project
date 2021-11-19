public static int rotate(int x) {
    return (x / 10) + (((int) (java.lang.Math.pow(10, ((net.n1da.dev.euler.helper.Mathe.getLength(x)) - 1)))) * (x % 10));
}