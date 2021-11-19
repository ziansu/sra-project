@java.lang.SuppressWarnings(value = "unchecked")
public void errNoKick(int code) {
    org.json.simple.JSONObject send = new org.json.simple.JSONObject();
    send.put("err", code);
    connection.send(send.toJSONString());
}