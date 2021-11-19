@java.lang.Override
public java.lang.String load(com.psddev.dari.db.Query<?> query) throws java.lang.Exception {
    java.lang.String sql = new com.psddev.dari.db.SqlQuery(this, query).selectStatement();
    query.setDatabase(null);
    return sql;
}