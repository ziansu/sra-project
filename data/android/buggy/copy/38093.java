private boolean _isInternalProperty(java.lang.String name) {
    if (((name.equals("availableReturnTypes")) || (name.equals("class"))) || (name.equals("desiredReturnTypes"))) {
        return true;
    }
    return false;
}