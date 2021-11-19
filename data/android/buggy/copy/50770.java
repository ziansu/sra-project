public static java.lang.String toStringWithhiddenAfter(final org.antlr.v4.runtime.ParserRuleContext aParseTreeRoot, final org.antlr.v4.runtime.TokenStream aTokenStream) {
    final java.lang.StringBuilder builder = new java.lang.StringBuilder();
    org.eclipse.titan.common.parsers.cfg.ConfigTreeNodeUtilities.print(builder, aParseTreeRoot, aTokenStream);
    return builder.toString();
}