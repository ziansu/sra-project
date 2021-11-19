private boolean isStringNullOrEmpty(java.lang.String input) {
    if (input == null) {
        return true;
    }
    if (input.isEmpty()) {
        return true;
    }
    return false;
}