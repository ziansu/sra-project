@java.lang.Override
public java.util.Collection<com.yahoo.elide.core.filter.FilterPredicate> visitNotExpression(com.yahoo.elide.core.filter.expression.NotFilterExpression expression) {
    filterPredicates.addAll(expression.getNegated().accept(this));
    return filterPredicates;
}