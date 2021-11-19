@java.lang.Override
public javax.jms.QueueSender createSender(javax.jms.Queue queue) throws javax.jms.JMSException {
    checkClosed();
    org.apache.qpid.jms.JmsDestination dest = org.apache.qpid.jms.message.JmsMessageTransformation.transformDestination(connection, queue);
    org.apache.qpid.jms.JmsQueueSender result = new org.apache.qpid.jms.JmsQueueSender(getNextProducerId(), this, dest);
    return result;
}