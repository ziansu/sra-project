public void returnStatement() throws java.lang.Exception {
    if (accept(Token.returnToken)) {
        next();
        expression();
    }else {
        throw new java.lang.Exception("Missing return statement");
    }
}