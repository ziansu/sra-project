public org.exist.xquery.Expression getLastExpression() {
    return steps.isEmpty() ? null : steps.get(((steps.size()) - 1));
}