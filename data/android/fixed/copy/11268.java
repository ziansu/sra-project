public java.lang.String databaseDir() {
    return prop.getProperty("database.dir", org.ethereum.config.SystemProperties.DEFAULT_DATABASE_DIR);
}