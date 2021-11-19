public static java.lang.String prepareDocToJson(java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> docs, java.lang.String format) {
    return com.orientechnologies.orient.core.serialization.serializer.OJSONWriter.listToJSON(docs, format);
}