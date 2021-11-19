public static void throwIt(long iterationCounter, final org.matheclipse.core.interfaces.IExpr expr) {
    throw new org.matheclipse.core.eval.exception.IterationLimitExceeded(iterationCounter, expr);
}