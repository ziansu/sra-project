public static java.lang.String trimRNumber(java.lang.String rNumber) {
    char first = rNumber.charAt(0);
    if ((first < '0') && ('9' < first)) {
        rNumber = rNumber.substring(1);
    }
    return rNumber;
}