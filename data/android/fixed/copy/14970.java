public java.lang.Object resolveResult(org.opencds.cqf.cql.execution.Context context, java.lang.Object element) {
    if (shouldInclude) {
        return (this.getReturn()) != null ? this.getReturn().getExpression().evaluate(context) : element;
    }
    return element;
}