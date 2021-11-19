public static long rotateRight(long n, int rotate) {
    return (n >>> rotate) ^ (n << (64 - rotate));
}