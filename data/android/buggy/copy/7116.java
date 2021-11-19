private boolean identifierValid(java.lang.String ident) {
    if (fields.containsKey(ident)) {
        return false;
    }
    return true;
}