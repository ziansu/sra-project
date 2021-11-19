private miniJava.SyntacticAnalyzer.Statement parseForInit() throws miniJava.SyntacticAnalyzer.Parser.SyntaxError {
    miniJava.SyntacticAnalyzer.Statement s = parseForInc();
    parseSpecificToken(TokenKind.SEMICOLON, ";");
    return s;
}