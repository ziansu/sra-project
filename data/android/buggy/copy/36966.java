public java.lang.String getEntity() {
    final int dotPos = property.indexOf('.');
    return dotPos == (-1) ? null : property.substring(0, (dotPos - 1));
}