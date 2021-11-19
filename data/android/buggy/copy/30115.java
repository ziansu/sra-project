public static com.smoope.sdk.SmoopeApi getInstance(final java.lang.String clientId, final java.lang.String clientSecret, final boolean sandbox) {
    return new com.smoope.sdk.impl.SmoopeClient(com.smoope.sdk.SmoopeApiFactory.builder(clientId, clientSecret, sandbox).build());
}