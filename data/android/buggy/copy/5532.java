@java.lang.Override
public java.sql.DatabaseMetaData getMetaData() throws java.sql.SQLException {
    return new nl.anchormen.sql4es.ESDatabaseMetaData(host, port, client, this.getClientInfo());
}