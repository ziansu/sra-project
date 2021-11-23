private void checkCondExpr() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST condAst = getMainAst().findFirstToken(TokenTypes.LPAREN).getNextSibling();
    checkExpressionSubtree(condAst, getIndent(), true, false);
}