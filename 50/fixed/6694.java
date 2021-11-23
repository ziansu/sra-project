public java.lang.Object visit(slp.UnaryOpExpr expr, java.lang.Object o) {
    return expr.getOperand().accept(this, o);
}