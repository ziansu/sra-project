public int toInt(java.lang.String code) {
    java.lang.Integer i = stringCodes.get(code);
    return i == null ? 0 : i;
}