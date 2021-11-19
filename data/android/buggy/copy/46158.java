public void number() throws java.lang.Exception {
    if (accept(Token.number)) {
        next();
    }else {
        throw new java.lang.Exception("Missing number");
    }
}