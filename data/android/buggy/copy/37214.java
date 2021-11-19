public static java.lang.String formatJson(java.lang.String json) throws java.io.IOException {
    java.util.Map map = com.cedarsoftware.util.io.JsonReader.jsonToMaps(json);
    java.util.Map args = new java.util.HashMap();
    args.put(com.cedarsoftware.util.io.JsonWriter.PRETTY_PRINT, "true");
    return com.cedarsoftware.util.io.JsonWriter.objectToJson(map, args);
}