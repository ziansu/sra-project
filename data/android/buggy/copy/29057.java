private void startKeepAliveSender(final io.callstats.sdk.CallStatsHttpClient httpClient) {
    io.callstats.sdk.CallStatsBridgeKeepAliveManager.scheduler.scheduleAtFixedRate(new java.lang.Runnable() {
        public void run() {
            sendKeepAliveBridgeMessage(appId, bridgeId, token, httpClient);
        }
    }, 0, 1000, java.util.concurrent.TimeUnit.MILLISECONDS);
}