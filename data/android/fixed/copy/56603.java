public java.lang.Boolean isChunkedEnabled() {
    return (this.configuration.getBoolean(com.baasbox.CHUNKED_RESPONSE)) && (this.isConfiguredDBLocal());
}