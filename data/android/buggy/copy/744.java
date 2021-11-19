public void errNoKick(com.monolc.felljs.Int code) {
    org.json.simple.JSONObject send = new org.json.simple.JSONObject();
    send.put("err", code);
    connection.send(send.toJSONString());
}