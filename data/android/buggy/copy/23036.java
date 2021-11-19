public void dropMessagesInSession(java.lang.String clientID) {
    m_persistentMessageStore.remove(clientID);
    m_db.commit();
}