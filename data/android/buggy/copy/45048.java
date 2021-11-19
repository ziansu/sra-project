public java.lang.Object VisitArrayVariable(ASTArrayVariable arrayvariable) {
    array.base().Accept(this);
    array.index().Accept(this);
    return null;
}