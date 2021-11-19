public java.lang.String recoverTaskId(com.google.protobuf.ByteString bs) {
    org.json.JSONObject o = new org.json.JSONObject(bs);
    return ((java.lang.String) (o.get(MagellanTaskDataJsonTag.UID)));
}