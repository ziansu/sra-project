private static java.lang.String getFetchByIdRequest(java.lang.String table, java.lang.String id) {
    return new no.hyper.memoryorm.builder.QueryBuilder().select().from(table).whereId(java.lang.Long.decode(id)).toSqlRequest();
}