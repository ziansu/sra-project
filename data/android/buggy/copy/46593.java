public static boolean areIndexableExpressions(java.util.List<org.voltdb.expressions.AbstractExpression> checkList, java.lang.StringBuffer msg) {
    for (org.voltdb.expressions.AbstractExpression expr : checkList) {
        if (!(org.voltdb.expressions.AbstractExpression.isIndexableExpression(expr, msg))) {
            return false;
        }
    }
    return true;
}