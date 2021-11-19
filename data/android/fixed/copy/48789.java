public java.lang.String recoverTaskId(java.lang.String data) {
    org.json.JSONObject o = new org.json.JSONObject(data);
    return ((java.lang.String) (o.get(MagellanTaskDataJsonTag.UID)));
}