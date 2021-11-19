public examproject.group22.roominator.Models.User parseOneUser(java.lang.String response, boolean withPass) throws org.json.JSONException {
    return parseOneUser(new org.json.JSONObject(response), withPass);
}