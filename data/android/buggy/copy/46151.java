public int doSubscribeAsset(final java.lang.String Asset) {
    com.jforex.dzjforex.ZorroBridge.logger.info("doSubscribeAsset called");
    return accountHandler.subscribeAsset(Asset);
}