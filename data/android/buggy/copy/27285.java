@java.lang.Override
public void ensureTable(org.araqne.logstorage.TableSchema schema) {
    if (!(tableRegistry.exists(schema.getName())))
        createTable(schema);
    
}