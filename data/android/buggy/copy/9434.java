private static boolean isPalindrome(int number) {
    final java.lang.String str = java.lang.Integer.toString(number);
    final java.lang.String rev = new java.lang.StringBuilder(str).reverse().toString();
    return str.equals(rev);
}