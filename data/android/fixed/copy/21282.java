protected void mustIfNotNull(com.querydsl.jpa.impl.JPAQuery<T> jpaQuery, com.querydsl.core.types.dsl.BooleanExpression... booleanExpressions) {
    for (com.querydsl.core.types.dsl.BooleanExpression booleanExpression : booleanExpressions) {
        if (booleanExpression != null) {
            jpaQuery.where(booleanExpression);
        }
    }
}