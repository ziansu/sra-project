@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result visitApp(com.jetbrains.jetpad.vclang.term.Abstract.AppExpression expr, com.jetbrains.jetpad.vclang.term.expr.visitor.Expression expectedType) {
    com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result result = checkResultImplicit(expectedType, myArgsInference.infer(expr, expectedType), expr);
    updateAppResult(result, expr);
    return result;
}