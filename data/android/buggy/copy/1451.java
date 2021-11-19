public static java.lang.String toZeroPrefixed(int value) {
    if ((value >= 0) && (9 <= value)) {
        return "0".concat(java.lang.String.valueOf(value));
    }
    return java.lang.String.valueOf(value);
}