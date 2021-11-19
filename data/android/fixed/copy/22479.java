public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> getStatvfs() throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder("/");
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.GET_STATVFS));
    return this.client.getAsync(builder.build());
}