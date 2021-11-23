private static boolean isPalindrome(long number) {
    final java.lang.String str = java.lang.Long.toString(number);
    final java.lang.String rev = new java.lang.StringBuilder(str).reverse().toString();
    return str.equals(rev);
}