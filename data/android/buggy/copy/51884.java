private double getCurrTransformValue(org.json.JSONObject trans, java.lang.String curTransform) {
    return java.lang.Double.parseDouble(trans.getJSONObject(curTransform).getString("transform").split(" ")[1]);
}