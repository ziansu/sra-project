public static boolean flip(int size, java.util.Random rnd) {
    return ((rnd.nextDouble()) * size) <= 1.0;
}