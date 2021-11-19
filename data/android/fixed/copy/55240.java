private com.fujitsu.queue.service.impl.Message doReceive(com.fujitsu.queue.service.impl.MessageConsumer consumer) throws com.fujitsu.queue.service.impl.JMSException {
    return consumer.receive(java.lang.Long.parseLong(Const.Queue.ACTIVEMQ_RECEIVE_TIMEOUT));
}