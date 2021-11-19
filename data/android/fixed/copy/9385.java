public static boolean validateCurrentNumber(int number, java.lang.String secret, int window) {
    long time = java.lang.System.currentTimeMillis();
    return io.mangoo.utils.TwoFactorUtils.validateCurrentNumber(number, secret, window, time);
}