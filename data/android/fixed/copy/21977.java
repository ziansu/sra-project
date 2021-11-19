public static final boolean isNumeric(java.lang.String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        java.lang.Double.parseDouble(strNum);
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
    return true;
}