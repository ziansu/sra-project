public static void checkExpression(java.lang.String expr) {
    com.duy.calculator.evaluator.exceptions.ExpressionChecker.checkBalanceBracket(expr);
    org.matheclipse.core.eval.EvalEngine.get().parse(expr);
}