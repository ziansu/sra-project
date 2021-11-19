public java.lang.Object VisitArrayVariable(ASTArrayVariable arrayvariable) {
    arrayvariable.base().Accept(this);
    arrayvariable.index().Accept(this);
    return null;
}