private boolean isDouble(java.lang.String input) {
    boolean isDouble = false;
    try {
        double temp = java.lang.Double.parseDouble(input);
        isDouble = true;
    } finally {
    }
    return isDouble;
}