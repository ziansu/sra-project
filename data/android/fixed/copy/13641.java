public java.lang.Object visit(bantam.visitor.BinaryArithPlusExpr node) {
    super.visit(node);
    visitBinaryArithExpr(node);
    return false;
}