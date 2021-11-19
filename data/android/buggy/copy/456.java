public int doBrokerAsset(final java.lang.String Asset, final double[] assetParams) {
    com.jforex.dzjforex.ZorroBridge.logger.info("doBrokerAsset called");
    return accountHandler.brokerAsset(Asset, assetParams);
}