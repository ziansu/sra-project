@java.lang.Override
public void sendMessageToQueue(eu.domibus.api.jms.JmsMessage message, java.lang.String destination) {
    message.getProperties().put(JmsMessage.PROPERTY_ORIGINAL_QUEUE, removeJmsModule(destination));
    eu.domibus.jms.spi.InternalJmsMessage internalJmsMessage = jmsMessageMapper.convert(message);
    internalJmsManager.sendMessage(internalJmsMessage, destination);
}