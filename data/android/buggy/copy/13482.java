public boolean AreYou(java.lang.String id) {
    boolean result = false;
    if (identifiers.contains(id)) {
        result = true;
    }
    return result;
}