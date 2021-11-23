private java.lang.String getPrettyJson(java.lang.Object json) {
    return json != null ? json instanceof java.lang.String ? gson.toJson(jsonParser.parse(json.toString())) : gson.toJson(json, json.getClass()) : "";
}