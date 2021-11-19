public static boolean convertToBool(java.lang.String s) {
    java.lang.String lower = s.toLowerCase();
    if (lower.equals("true")) {
        return true;
    }
    return false;
}