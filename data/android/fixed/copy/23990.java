protected void deployContainer(java.lang.String deployConf) throws java.io.IOException {
    com.twitter.heron.scheduler.utils.HttpJsonClient jsonAPIClient = new com.twitter.heron.scheduler.utils.HttpJsonClient(this.baseUriPath);
    jsonAPIClient.post(deployConf, java.net.HttpURLConnection.HTTP_CREATED);
}