private boolean isClassVarDec(com.tamco.hack.compiler.lexical.Lexical token) {
    return ((token.getLecical()) == "static") || ((token.getLecical()) == "field");
}