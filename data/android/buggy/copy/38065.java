@java.lang.Override
protected org.codice.ddf.migration.MigrationWarning newWarning(java.lang.String reason) {
    return new org.codice.ddf.migration.MigrationWarning(Messages.EXPORT_JAVA_PROPERTY_WARNING, propertiesPath, getProperty(), getPath(), reason);
}