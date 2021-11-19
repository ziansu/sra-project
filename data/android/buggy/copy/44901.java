public static java.lang.String byteToDecimalString(byte value) {
    java.lang.String decimalString = java.lang.String.valueOf((value & 255));
    return decimalString;
}