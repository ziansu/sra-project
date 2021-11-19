@java.lang.Override
public net.hydromatic.optiq.jdbc.OptiqSchema getSubSchema(java.lang.String schemaName, boolean caseSensitive) {
    net.hydromatic.optiq.Schema s = schema.getSubSchema(schemaName);
    if (s != null) {
        return new net.hydromatic.optiq.jdbc.SimpleOptiqSchema(this, s, schemaName);
    }
    return subSchemas.get(schemaName);
}