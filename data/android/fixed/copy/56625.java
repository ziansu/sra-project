public java.lang.String getEntityProperty() {
    if ((type) == null)
        return property;
    
    final int dotPos = property.indexOf('.');
    return dotPos == (-1) ? property : property.substring((dotPos + 1));
}