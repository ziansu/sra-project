public static long cycleDigits(long n) {
    return java.lang.Long.parseLong(((java.lang.String.valueOf(n).substring(1)) + (java.lang.String.valueOf(n).substring(0, 1))));
}