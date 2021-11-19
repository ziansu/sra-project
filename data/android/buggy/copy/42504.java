public ResourceType unregisterType(java.lang.String extension) {
    if (extension == null) {
        throw new java.lang.NullPointerException();
    }
    if (extension.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    return types.remove(extension);
}