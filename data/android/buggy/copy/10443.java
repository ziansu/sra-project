public void initialize() {
    if ((cloudWatchClient) != null) {
        cloudWatchClient = new com.amazonaws.services.cloudwatch.AmazonCloudWatchClient(awsCredentials);
    }
    if (addInstanceData) {
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister.instanceId = com.j256.simplemetrics.persister.CloudWatchMetricsPersister.downloadInstanceId(com.j256.simplemetrics.persister.CloudWatchMetricsPersister.AWS_CONNECT_TIMEOUT_MILLIS);
    }
}