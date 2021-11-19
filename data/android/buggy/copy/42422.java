public static long parseLong(java.lang.String longProperty) {
    try {
        return java.lang.Integer.parseInt(longProperty);
    } catch (java.lang.NumberFormatException nfe) {
        throw new java.lang.RuntimeException(((longProperty + " not a number. ") + (nfe.getMessage())));
    }
}