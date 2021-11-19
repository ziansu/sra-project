private org.apache.zeppelin.socket.Message deserializeMessage(java.lang.String msg) {
    org.apache.zeppelin.socket.Message m = gson.fromJson(msg, org.apache.zeppelin.socket.Message.class);
    return m;
}