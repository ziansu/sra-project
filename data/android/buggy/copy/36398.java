@java.lang.Override
protected void setInitialHiddenTokens(org.eclipse.xtext.parser.antlr.XtextTokenStream tokenStream) {
    tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}