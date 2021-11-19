public java.util.List<java.lang.Object> getSqlWhereParams() {
    if ((_sqlWhereParams) == null) {
        buildSqlWhereClause();
    }
    return _sqlWhereParams;
}