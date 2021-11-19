public void keepAlive() throws java.lang.Exception {
    checkConnected();
    sendBytes(wireFormat.marshal(new org.fusesource.mqtt.codec.PINGREQ().encode()));
}