private synchronized java.security.KeyStore getPeerKeyStore() throws java.lang.Exception {
    if ((io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore) == null) {
        io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore = loadKeyStore();
    }
    return io.subutai.core.hubadapter.impl.HttpClient.peerKeyStore;
}