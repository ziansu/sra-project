@java.lang.Override
public liquibase.CatalogAndSchema getSchemaFromJdbcInfo(java.lang.String rawCatalogName, java.lang.String rawSchemaName) {
    return new liquibase.CatalogAndSchema(rawSchemaName, null).customize(this);
}