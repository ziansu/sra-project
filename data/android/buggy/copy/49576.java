public void sendMqtt(java.lang.String payload, java.lang.String sendTopic, java.lang.String receiveTopic, int qot) {
    open();
    this.payload = payload;
    this.sendTopic = sendTopic;
    this.receiveTopic = receiveTopic;
    this.qot = qot;
}