public long getLong(java.lang.String columnLabel) throws java.sql.SQLException {
    return java.lang.Long.parseLong(((java.lang.String) (currentRow[columnList.indexOf(columnLabel)])));
}