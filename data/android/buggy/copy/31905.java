@java.lang.Override
public void onExchangeOutcome(long exchangeId, boolean isSuccess, com.bolyartech.forge.base.exchange.ForgeExchangeResult result) {
    mSession.prolong();
    mLogger.debug("Forge exchange returned with code {}", result.getCode());
    onSessionExchangeOutcome(exchangeId, isSuccess, result);
}