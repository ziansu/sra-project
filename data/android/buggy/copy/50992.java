public boolean canPlayerCollectIncome(final games.strategy.engine.data.PlayerID player, final games.strategy.engine.data.GameData data) {
    return games.strategy.triplea.attachments.TerritoryAttachment.doWeHaveEnoughCapitalsToProduce(m_player, getData());
}