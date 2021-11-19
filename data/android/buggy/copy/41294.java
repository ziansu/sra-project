public java.sql.ResultSet getTableTypes() throws java.sql.SQLException {
    checkOpen();
    if ((getTableTypes) == null) {
        getTableTypes = conn.prepareStatement(("select 'TABLE' as TABLE_TYPE " + "union select 'VIEW' as TABLE_TYPE;"));
    }
    getTableTypes.clearParameters();
    return getTableTypes.executeQuery();
}