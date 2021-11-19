public org.kurento.client.KurentoClient getKurentoClient() {
    if (((kurentoClient) == null) && (isKmsStarted)) {
        kurentoClient = createKurentoClient();
    }
    return kurentoClient;
}