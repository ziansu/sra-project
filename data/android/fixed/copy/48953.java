public java.lang.String getAndSaveNickNameForElementType(com.google.api.codegen.discovery.config.TypeInfo typeInfo) {
    return typeTable.getAndSaveNicknameFor(getTypeNameForElementType(typeInfo));
}