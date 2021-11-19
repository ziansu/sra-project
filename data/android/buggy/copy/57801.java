private java.lang.String getPrettyJson(java.lang.String json, java.lang.String jsonPath) {
    try {
        return getPrettyJson(com.jayway.jsonpath.JsonPath.read(json, jsonPath).toString());
    } catch (java.lang.Exception e) {
        return "No match";
    }
}