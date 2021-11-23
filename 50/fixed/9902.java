public static java.lang.Long tryParse(java.lang.String s) {
    try {
        return java.lang.Long.parseLong(s);
    } catch (java.lang.NumberFormatException e) {
        return -1L;
    }
}