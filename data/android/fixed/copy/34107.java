public static boolean validateNEVersion(java.lang.String input) {
    try {
        if ((input.length()) == 3) {
            return true;
        }
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    return false;
}