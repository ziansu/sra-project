public java.lang.String getArrayTypeString() {
    java.lang.String typeStr = "";
    if ((arrayType) != null) {
        typeStr = arrayType.getGenericComponentType().getTypeName();
    }
    return typeStr;
}