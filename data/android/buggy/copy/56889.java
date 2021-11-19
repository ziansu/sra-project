public java.lang.String getServerUrl() {
    if (sessions.isEmpty())
        return null;
    
    com.orientechnologies.orient.client.remote.OStorageRemoteNodeSession curSession = sessions.values().iterator().next();
    return curSession.getServerURL();
}