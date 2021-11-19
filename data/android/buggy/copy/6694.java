public java.lang.Object visit(slp.UnaryOpExpr expr, java.lang.Object o) {
    expr.getOperand().accept(this, o);
    return null;
}