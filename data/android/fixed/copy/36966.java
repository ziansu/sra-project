public java.lang.String getEntity() {
    if ((type) == null)
        return null;
    
    final int dotPos = property.indexOf('.');
    return dotPos == (-1) ? null : property.substring(0, dotPos);
}