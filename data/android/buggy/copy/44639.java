@java.lang.Override
protected void enterTerminal(org.antlr.v4.tool.ast.GrammarAST tree) {
    java.lang.String text = tree.getText();
    if (text.equals("''")) {
        g.tool.errMgr.grammarError(ErrorType.EMPTY_STRINGS_AND_SETS_NOT_ALLOWED, g.fileName, tree.token);
    }
}