private static synchronized java.security.KeyStore getPeerKeyStore() throws java.lang.Exception {
    if ((io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore) == null) {
        io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore = io.subutai.core.hubadapter.impl.HttpClient.loadKeyStore();
    }
    return io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore;
}