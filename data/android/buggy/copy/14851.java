private void visitSemi(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    if ((exprDepth) == 0) {
        lastStatementEnd = ast.getLineNo();
    }
}