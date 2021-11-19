@java.lang.Override
public void enterBracketed_stmts(com.github.simpleregex.parser.SRLParser.Bracketed_stmtsContext ctx) {
    addRegexStart(com.github.simpleregex.SRLParseTreeListener.RegexElement.GROUP);
    ctx.stmt().forEach(this::enterStmt);
    addRegexEnd(com.github.simpleregex.SRLParseTreeListener.RegexElement.GROUP);
}