public double getNumber() {
    try {
        return java.lang.Double.parseDouble(getText());
    } catch (java.lang.NumberFormatException e) {
        return 0;
    }
}