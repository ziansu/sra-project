@java.lang.Override
public void addInFlight(org.eclipse.moquette.spi.impl.events.PublishEvent evt, java.lang.String clientID, int packetID) {
    java.lang.String publishKey = java.lang.String.format("%s%d", clientID, packetID);
    org.eclipse.moquette.spi.impl.storage.StoredPublishEvent storedEvt = convertToStored(evt);
    m_inflightStore.put(publishKey, storedEvt);
    m_db.commit();
}