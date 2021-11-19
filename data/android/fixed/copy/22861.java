@java.lang.Override
protected com.ibm.wala.cast.tree.CAstNode visitSubqueryExpression(com.facebook.presto.sql.tree.SubqueryExpression node, sqlAnalysis.PrestoVisitor.Context context) {
    sqlAnalysis.PrestoVisitor.Context c = new sqlAnalysis.PrestoVisitor.Context(context);
    return sqlAnalysis.PrestoVisitor.process(node.getQuery(), c);
}