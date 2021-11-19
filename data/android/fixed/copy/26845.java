public boolean contains(java.lang.String[] array, java.lang.String resource) {
    for (java.lang.String element : array) {
        if (element.equals(resource)) {
            return true;
        }
    }
    return false;
}