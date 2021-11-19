public net.sf.jsqlparser.expression.Expression getPlusExpression(java.lang.Object param) {
    return new net.sf.jsqlparser.expression.LongValue(((java.lang.Long.parseLong(param.toString())) + 1));
}