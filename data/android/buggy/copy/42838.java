public final void action(com.epam.danilchican.betting.command.CommandType type, com.epam.danilchican.betting.request.RequestContent content) throws com.epam.danilchican.betting.exception.ReceiverException {
    type.doReceiver(content);
    setDefaultContentAttributes(content);
}