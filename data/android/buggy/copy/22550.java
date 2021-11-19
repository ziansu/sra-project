public java.lang.String getFullNameType() {
    java.lang.String typeName = getClassTypeName();
    return java.lang.String.format(getTypeReg(), typeName);
}