public java.sql.ResultSet getSuperTables(java.lang.String c, java.lang.String s, java.lang.String t) throws java.sql.SQLException {
    return execute(("select null as TABLE_CAT, null as TABLE_SCHEM, " + "null as TABLE_NAME, null as SUPERTABLE_NAME limit 0;"));
}