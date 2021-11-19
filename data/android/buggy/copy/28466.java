private void putDescriptionInJSONObj(org.json.simple.JSONObject object, java.lang.String description) {
    if (!(description.equals(null))) {
        object.put("description", description);
    }else {
        object.put("description", "");
    }
}