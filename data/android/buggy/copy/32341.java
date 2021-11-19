public com.smoope.sdk.SmoopeApi build() {
    return new com.smoope.sdk.impl.SmoopeClient(this.restClient.build());
}