@java.lang.Override
public java.util.Collection<com.yahoo.elide.core.filter.FilterPredicate> visitOrExpression(com.yahoo.elide.core.filter.expression.OrFilterExpression expression) {
    expression.getLeft().accept(this);
    expression.getRight().accept(this);
    return filterPredicates;
}