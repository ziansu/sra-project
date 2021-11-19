@java.lang.Override
public java.util.List<org.eclipse.moquette.spi.impl.events.PublishEvent> retrievePersistedPublishes(java.lang.String clientID) {
    return new java.util.ArrayList(m_persistentMessageStore.get(clientID));
}