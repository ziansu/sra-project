protected com.contrastsecurity.cassandra.migration.resolver.MigrationResolver createMigrationResolver() {
    return new com.contrastsecurity.cassandra.migration.resolver.CompositeMigrationResolver(classLoader, new com.contrastsecurity.cassandra.migration.config.ScriptsLocations(configs.getScriptsLocations()), configs.getEncoding());
}