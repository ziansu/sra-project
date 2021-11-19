private static boolean validateHex(java.lang.String hex) {
    if ((!(hex.matches("([0-9A-F])+"))) || ((hex.length()) != 8))
        return false;
    
    return true;
}