public static final boolean isNumeric(java.lang.String strNum) {
    try {
        java.lang.Double.parseDouble(strNum);
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
    return true;
}