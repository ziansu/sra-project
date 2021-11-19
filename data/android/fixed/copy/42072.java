@java.lang.Override
public void unlockMessage(com.microsoft.windowsazure.services.servicebus.models.BrokeredMessage message) throws com.microsoft.windowsazure.exception.ServiceException {
    getChannel().resource(message.getLockLocation()).put("0");
}