private org.json.JSONObject convertStringToJSON(java.lang.String answer) {
    try {
        return new org.json.JSONObject(answer);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}