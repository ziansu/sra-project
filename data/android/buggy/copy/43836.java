public static io.transwarp.generate.config.expr.ExprConfig defaultNestedExpr(io.transwarp.generate.config.expr.ExprConfig config) {
    final io.transwarp.generate.config.expr.ExprConfig exprConfig = new io.transwarp.generate.config.expr.ExprConfig(config.candidates, config.getFrom());
    exprConfig.setUdfDepth(io.transwarp.generate.config.expr.ExprConfig.NESTED_EXPR_UDF_DEPTH);
    return exprConfig;
}