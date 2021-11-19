private compiler.parser.ast.AST ident() throws java.lang.Exception {
    getNextToken();
    errorCheck(Token.IDENTIFIER);
    compiler.parser.ast.AST id = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.terminal, compiler.parser.ast.AST.currToken);
    return id;
}