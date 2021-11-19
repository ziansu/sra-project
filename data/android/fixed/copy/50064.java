public boolean ispalindrome(int victim) {
    java.lang.String victimString = java.lang.String.valueOf(victim);
    return new java.lang.StringBuilder(victimString).reverse().toString().equals(victimString);
}