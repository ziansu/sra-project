private static boolean isValidString(java.lang.String string) {
    if ((string == null) || (string.trim().equals(""))) {
        return false;
    }
    return true;
}