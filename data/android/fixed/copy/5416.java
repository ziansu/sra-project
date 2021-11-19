private void addMacrosForExpansion(java.lang.String name, de.fosd.typechef.featureexpr.FeatureExpr feature, de.fosd.typechef.lexer.MacroData m) throws de.fosd.typechef.lexer.LexerException {
    macrosForExpansion = addMacro(name, feature, m, macrosForExpansion);
}