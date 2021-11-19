public cat.uab.cephis.ast.AST getLastChild() {
    if ((size()) == 0)
        return null;
    
    return get(((size()) - 1));
}