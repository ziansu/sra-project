protected synchronized void putMessage(java.lang.Object message) throws java.lang.InterruptedException {
    while ((messages.size()) >= (org.overskeid.mqtt.service.MqttCommonucationHandler.MAXQUEUE))
        wait();
    
    messages.addElement(message);
    notify();
}