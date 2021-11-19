private boolean parseDefaultStatement() {
    com.intellij.lang.PsiBuilder.Marker mark = mark();
    match(glslplugin.lang.parser.DEFAULT_KEYWORD, "Expected 'case'");
    match(glslplugin.lang.parser.COLON, "Expected ':'");
    mark.done(glslplugin.lang.parser.DEFAULT_STATEMENT);
    return true;
}