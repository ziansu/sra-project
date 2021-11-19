public org.json.JSONObject getObject() {
    try {
        return new org.json.JSONObject(responseText);
    } catch (org.json.JSONException ex) {
        return null;
    }
}