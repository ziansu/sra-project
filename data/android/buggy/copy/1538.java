public void stop() {
    zkModule.stop();
    redisModule.stop();
    configCenterModule.stop();
    dnsModule.stop();
    connServerModule.stop();
    gatewayServerModule.stop();
    adminServerModule.stop();
}