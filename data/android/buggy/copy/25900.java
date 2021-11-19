public static boolean isNumeric(java.lang.String s) {
    if (s.matches("[-+]?[0-9]*\\.?[0-9]+")) {
        return true;
    }else {
        return false;
    }
}