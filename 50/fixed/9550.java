private java.lang.String getExtension() {
    return type.getTypeName().substring(((type.getTypeName().lastIndexOf('.')) + 1)).toLowerCase();
}