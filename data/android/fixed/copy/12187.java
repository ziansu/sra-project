private static java.lang.String createTrainPositionRequestUrl(java.lang.String host, int port, java.lang.String trainId) {
    java.lang.String baseUrl = com.traintrax.navigation.service.rest.client.RemoteTrainPositionService.createTrainPositionRequestUrl(host, port);
    java.lang.String finalUrl = (baseUrl + "?id=") + trainId;
    return finalUrl;
}