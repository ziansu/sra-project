public java.lang.Object VisitNewClassExpression(ASTNewClassExpression classexpression) {
    int i;
    for (i = 0; i < (variabledefs.size()); i++) {
        variabledefs.elementAt(i).Accept(this);
    }
    return null;
}