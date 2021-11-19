@java.lang.Override
public com.squareup.okhttp.Request authenticate(final java.net.Proxy proxy, final com.squareup.okhttp.Response response) {
    return response.request().newBuilder().header(com.google.common.net.HttpHeaders.AUTHORIZATION, authHeader).build();
}