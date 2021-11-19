protected void putMessage(java.lang.Object message) throws java.lang.InterruptedException {
    synchronized(messages) {
        while ((messages.size()) >= (org.overskeid.mqtt.service.MqttCommonucationHandler.MAXQUEUE))
            messages.wait();
        
        messages.addElement(message);
        messages.notify();
    }
}