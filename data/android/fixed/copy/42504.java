public void unregisterType(java.lang.String extension) {
    if (extension == null) {
        throw new java.lang.NullPointerException();
    }
    if (extension.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    types.remove(extension);
}