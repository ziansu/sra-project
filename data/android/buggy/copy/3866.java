public static void main(java.lang.String[] args) {
    Parser.AST ast = Parser.SQLParserUntil.AssSQlASTgen("INSERT INTO Persons (LastName, Address) VALUES ('Wilson', 'Champs-Elysees');");
    Utils.ASTTestUtils.ASTTestPrint(ast.getRoot_set().get(0));
}