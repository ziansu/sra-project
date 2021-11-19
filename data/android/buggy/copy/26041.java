private static boolean isValidString(java.lang.String string) {
    string = string.trim();
    if ((string == null) || (string.equals(""))) {
        return false;
    }
    return true;
}