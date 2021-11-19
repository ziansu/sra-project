private void validateUserHasAccessForTradeReply(catan.domain.model.game.TradeProposition tradeProposition) throws catan.domain.exception.PlayException {
    if ((tradeProposition == null) || ((tradeProposition.isAcceptedTrade()) == null)) {
        log.debug("Required action TRADE_REPLY is not allowed for player");
        throw new catan.domain.exception.PlayException(catan.services.impl.PlayServiceImpl.ERROR_CODE_ERROR);
    }
}