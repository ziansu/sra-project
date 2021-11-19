public java.lang.String getJdbcType(int sqlType) {
    java.lang.String sqlTypeName = jdbcTypes.get(sqlType);
    if (sqlTypeName == null) {
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unknown SQL type value '%d'", sqlType));
    }
    return sqlTypeName;
}