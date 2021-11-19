public void json(java.util.HashMap<java.lang.String, java.lang.Object> map) {
    org.servoframework.json.JSONObject obj = new org.servoframework.json.JSONObject(map);
    content.append(obj.toJSONString());
}