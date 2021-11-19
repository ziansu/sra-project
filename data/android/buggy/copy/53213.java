private org.simplity.json.JSONObject extractToJson(org.simplity.kernel.dm.Record record, java.sql.Struct struct, java.sql.CallableStatement stmt) throws java.sql.SQLException {
    org.simplity.json.JSONWriter writer = new org.simplity.json.JSONWriter();
    record.toJsonObjectFromStruct(struct, writer);
    return new org.simplity.json.JSONObject(writer);
}