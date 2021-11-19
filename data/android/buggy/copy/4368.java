public com.google.gson.JsonObject getJsonObjectValue(java.lang.String key) {
    com.google.gson.JsonObject data = new com.google.gson.JsonParser().parse(getValue(key)).getAsJsonObject();
    return data;
}