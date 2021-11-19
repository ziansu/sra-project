public void stop() {
    connServerModule.stop();
    gatewayServerModule.stop();
    adminServerModule.stop();
    redisModule.stop();
    configCenterModule.stop();
    dnsModule.stop();
    zkModule.stop();
}