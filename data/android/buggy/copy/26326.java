public void init() throws javax.jms.JMSException {
    session.add(this);
    startConsumerResource();
}