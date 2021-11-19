public static java.lang.String toMySqlString(com.alibaba.druid.sql.ast.SQLObject sqlObject, com.alibaba.druid.sql.SQLUtils.FormatOption option) {
    return com.alibaba.druid.sql.SQLUtils.toSQLString(sqlObject, JdbcConstants.MYSQL, option);
}