public static it.unibo.drescue.communication.messages.MessageType getMessageNameByType(final java.lang.String messageType) {
    for (final it.unibo.drescue.communication.messages.MessageType name : it.unibo.drescue.communication.messages.MessageType.values()) {
        if (messageType.equals(name.getMessageType())) {
            return name;
        }
    }
    return MessageType.UNKNOWN_MESSAGE;
}