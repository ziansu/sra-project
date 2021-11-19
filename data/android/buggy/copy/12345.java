private boolean matches() {
    for (java.lang.String string : patterns) {
        if (!(input.toLowerCase().matches(string))) {
            return true;
        }
    }
    return false;
}