public void setObject(java.lang.String uri, boolean literal) {
    if (literal) {
        objectNode = defaultModel.createLiteral(uri);
    }else {
        objectNode = defaultModel.createResource(uri);
    }
}