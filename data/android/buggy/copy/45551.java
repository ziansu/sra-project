public <T> T fromPath(java.lang.String path, java.lang.Class<T> clazz) {
    this.clazz = clazz;
    com.github.onlynight.fastini.IniDocument document = new com.github.onlynight.fastini.IniDocument(path);
    document.parse();
    getNeedParseFieldsName();
    return fromDocument(document);
}