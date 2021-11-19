@java.lang.Override
public javax.jms.QueueConnectionFactory createConnectionFactory() {
    return jantje(props.getString("jndiQueuemanager"));
}