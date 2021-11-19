private boolean isUploadingFile() {
    return (httpMethod.equals(cloud.TelestreamCloudRequest.HttpMethod.POST)) && (data.containsKey(cloud.TelestreamCloudRequest.KEY_FILE));
}