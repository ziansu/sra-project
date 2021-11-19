public static java.lang.String format(java.lang.String sql, java.lang.String dbType, java.util.List<java.lang.Object> parameters) {
    return com.alibaba.druid.sql.SQLUtils.format(sql, dbType, parameters, null, false);
}