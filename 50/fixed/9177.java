public com.oltpbenchmark.util.json.JSONArray put(double value) throws com.oltpbenchmark.util.json.JSONException {
    java.lang.Double d = value;
    com.oltpbenchmark.util.json.JSONObject.testValidity(d);
    put(d);
    return this;
}