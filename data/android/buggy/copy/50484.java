@java.lang.Override
public java.lang.Void visitQueriedDocTable(io.crate.analyze.relations.QueriedDocTable table, io.crate.analyze.relations.RelationNormalizer.UnionPushDownContext context) {
    io.crate.analyze.relations.QuerySpec querySpec = table.querySpec();
    pushDownLimit(querySpec, context.limit);
    pushDownOrderBy(querySpec, context.orderBy);
    io.crate.analyze.relations.RelationNormalizer.UnionPushDownVisitor.rewritePushedDownOrderBy(querySpec);
    return null;
}