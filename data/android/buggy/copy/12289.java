@java.lang.Override
public void setCatalog(java.lang.String catalog) throws java.sql.SQLException {
    ensureNotClosed();
    throw new java.sql.SQLFeatureNotSupportedException("Catalogs are not supported.");
}