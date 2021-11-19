public java.sql.ResultSet getSchemas() throws java.sql.SQLException {
    if ((getSchemas) == null) {
        getSchemas = conn.prepareStatement("select null as TABLE_SCHEM, null as TABLE_CATALOG limit 0;");
    }
    return getSchemas.executeQuery();
}