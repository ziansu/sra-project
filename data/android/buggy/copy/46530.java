private boolean isValid() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : valid.entrySet()) {
        if (!(entry.getValue())) {
            return false;
        }
    }
    return true;
}