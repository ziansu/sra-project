@java.lang.Override
public <T extends de.brockhaus.m2m.message.M2MMessage> void handleMessage(T message) {
    de.brockhaus.m2m.receiver.file.FileAdapter.LOG.debug("handling message");
    try {
        super.doChain(message);
    } catch (de.brockhaus.m2m.message.M2MCommunicationException e) {
        de.brockhaus.m2m.receiver.file.FileAdapter.LOG.error(e);
    }
}