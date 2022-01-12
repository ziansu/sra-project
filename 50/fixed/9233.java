public org.kurento.client.KurentoClient getKurentoClient() {
    if ((kurentoClient) == null) {
        kurentoClient = createKurentoClient();
    }
    return kurentoClient;
}