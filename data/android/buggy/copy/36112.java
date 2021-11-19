public java.sql.Connection newJdbcConnection(org.apache.hadoop.conf.Configuration conf) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String connectionUrl = org.apache.phoenix.util.QueryUtil.getConnectionUrl(new java.util.Properties(), conf);
    org.opencb.opencga.storage.hadoop.variant.index.phoenix.VariantPhoenixHelper.logger.debug(("connectionUrl = " + connectionUrl));
    return java.sql.DriverManager.getConnection(connectionUrl);
}