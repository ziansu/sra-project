private void ackSettingsLater(final com.squareup.okhttp.internal.spdy.Settings peerSettings) {
    com.squareup.okhttp.internal.spdy.SpdyConnection.executor.submit(new com.squareup.okhttp.internal.NamedRunnable("OkHttp %s ACK Settings", hostName) {
        @java.lang.Override
        public void execute() {
            try {
                frameWriter.ackSettings(peerSettings);
            } catch (java.io.IOException ignored) {
            }
        }
    });
}