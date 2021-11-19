public java.lang.String getEntityProperty() {
    final int dotPos = property.indexOf('.');
    return dotPos == (-1) ? property : property.substring(dotPos);
}