private void checkValue(int def) {
    if ((def > 200) || (def < 0)) {
        throw new java.lang.IllegalArgumentException("val must be between 0 and 200");
    }
}