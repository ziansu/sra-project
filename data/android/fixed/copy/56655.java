private org.json.JSONObject getResponse() {
    try {
        if (fieldsAreOk) {
            jsonResponse.put(FieldsNames.NO_ERRORS, true);
            return jsonResponse;
        }
        return jsonResponse;
    } catch (org.json.JSONException e) {
        return new org.json.JSONObject();
    }
}