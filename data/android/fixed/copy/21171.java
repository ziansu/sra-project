@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result visitError(com.jetbrains.jetpad.vclang.term.Abstract.ErrorExpression expr, com.jetbrains.jetpad.vclang.term.expr.visitor.Expression expectedType) {
    myErrors.add(new com.jetbrains.jetpad.vclang.term.expr.visitor.GoalError(myLocalContext, expectedType, expr));
    return null;
}