@java.lang.Override
public void setPlayerToTradeWith(int playerIndex) {
    trade.setReceiverNumber(new model.player.PlayerIdx(playerIndex));
    personToAsk = true;
    updateEnableTrade();
}