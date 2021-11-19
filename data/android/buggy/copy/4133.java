public void start() throws JMSException {
    conn.start();
    conn.setClientID(name);
    session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
    consumer = session.createDurableSubscriber(session.createTopic(dest), name);
}