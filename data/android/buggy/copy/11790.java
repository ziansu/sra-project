public void keepAlive() throws java.lang.Exception {
    checkConnected();
    org.apache.activemq.util.ByteSequence payload = wireFormat.marshal(new org.fusesource.mqtt.codec.PINGREQ().encode());
    connection.getRemote().sendBytes(java.nio.ByteBuffer.wrap(payload.data));
}