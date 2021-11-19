public com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr clone() {
    com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr var = new com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr(name, global);
    var.index = index;
    return var;
}