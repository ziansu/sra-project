protected boolean isFilterable(java.lang.String statement) {
    return ((statement.indexOf("xwikidocument as doc")) > (-1)) || ((statement.indexOf("xwikidocument doc")) > (-1));
}