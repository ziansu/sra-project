public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> unlink(java.lang.String path) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.UNLINK), null);
    return this.client.deleteAsync(builder.build());
}