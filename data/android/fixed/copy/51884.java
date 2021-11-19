private java.lang.String getCurrTransformValue(org.json.JSONObject trans, java.lang.String curTransform) {
    return trans.getJSONObject(curTransform).getString("transform").split(" ")[1];
}