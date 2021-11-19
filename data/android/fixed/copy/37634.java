private boolean isJson(java.lang.String jsonString) {
    try {
        new org.json.JSONObject(jsonString);
        return true;
    } catch (org.json.JSONException je) {
        return false;
    }
}