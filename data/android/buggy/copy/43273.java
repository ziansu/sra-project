public static com.google.gson.JsonObject createJsonFromString(java.lang.String keyName, java.lang.String value) {
    com.google.gson.JsonParser parser = new com.google.gson.JsonParser();
    java.lang.String json = java.lang.String.format("{\"%s\": \"%s\"}", keyName, value);
    com.google.gson.JsonObject jsonObj = parser.parse(json).getAsJsonObject();
    return jsonObj;
}