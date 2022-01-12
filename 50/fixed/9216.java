public static boolean exactIntegers(java.lang.Integer i1, java.lang.Integer i2) {
    if (i1 == null) {
        return i2 == null;
    }
    return i1.equals(i2);
}