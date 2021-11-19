@java.lang.Override
public java.lang.Object visit(bantam.visitor.ConstIntExpr node) {
    super.visit(node);
    node.setExprType(this.INT);
    return null;
}