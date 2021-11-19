private boolean checkIfSyncInProgress(long guestId, org.fluxtream.core.connectors.Connector connector) {
    final org.fluxtream.core.api.ApiKey apiKey = guestService.getApiKey(guestId, connector);
    return apiKey.synching;
}