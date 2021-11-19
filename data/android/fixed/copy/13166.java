private void parseMessageV2(org.json.JSONObject jsObject) {
    try {
        msgId = jsObject.getString("messageId");
    } catch (java.lang.Exception e) {
    }
    parseMessageV1(jsObject);
}