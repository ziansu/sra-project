@java.lang.Override
public com.orctom.rmq.Ack onMessage(com.orctom.rmq.Message message) {
    return actor.onMessage(message);
}