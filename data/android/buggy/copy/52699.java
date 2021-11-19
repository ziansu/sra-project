public org.exist.xquery.Expression getLastExpression() {
    if ((steps.size()) == 0) {
        return null;
    }
    return steps.get(((steps.size()) - 1));
}