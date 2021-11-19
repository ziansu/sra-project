private org.simplity.json.JSONArray extractToJsonArray(org.simplity.kernel.dm.Record record, java.lang.Object[] array, java.sql.CallableStatement stmt) throws java.sql.SQLException {
    org.simplity.json.JSONWriter writer = new org.simplity.json.JSONWriter();
    record.toJsonArrayFromStruct(array, writer);
    return new org.simplity.json.JSONArray(writer);
}