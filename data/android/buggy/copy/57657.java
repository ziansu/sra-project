public static java.lang.String format(java.lang.String sql, java.lang.String dbType, com.alibaba.druid.sql.SQLUtils.FormatOption option) {
    return com.alibaba.druid.sql.SQLUtils.format(sql, dbType, null, option, false);
}