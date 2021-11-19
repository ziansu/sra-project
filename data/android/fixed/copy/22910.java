@java.lang.SuppressWarnings(value = "ResultOfMethodCallIgnored")
private boolean checkInteger(java.lang.String s) {
    boolean isInteger = true;
    try {
        java.lang.Integer.parseInt(s.trim());
    } catch (java.lang.Exception e) {
        isInteger = false;
    }
    return isInteger;
}