public void sendTextMessage(java.lang.String s) throws javax.jms.JMSException {
    javax.jms.TextMessage textMessage = session.createTextMessage(s);
    messageProducer.send(textMessage);
}