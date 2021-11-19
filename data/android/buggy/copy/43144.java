public int doBrokerTrade(final int nTradeID, final double[] orderParams) {
    com.jforex.dzjforex.ZorroBridge.logger.info("doSubscribeAsset called");
    return tradeHandler.brokerTrade(nTradeID, orderParams);
}