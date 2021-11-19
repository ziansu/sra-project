public java.sql.ResultSet getSchemas() throws java.sql.SQLException {
    return execute("select null as TABLE_SCHEM, null as TABLE_CATALOG limit 0;");
}