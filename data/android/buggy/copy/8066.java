private boolean isValidBoolean(java.lang.String sampBoolean) {
    boolean valid = false;
    try {
        java.lang.Boolean.parseBoolean(sampleBoolean);
        valid = true;
    } catch (java.lang.NumberFormatException error) {
        popup.displayText("Only boolean values are allowed");
    }
    return valid;
}