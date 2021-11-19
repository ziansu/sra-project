private miniJava.SyntacticAnalyzer.Statement parseForInit() throws miniJava.SyntacticAnalyzer.Parser.SyntaxError {
    miniJava.SyntacticAnalyzer.Statement s = parseForInc(true);
    parseSpecificToken(TokenKind.SEMICOLON, ";");
    return s;
}