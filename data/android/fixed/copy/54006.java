public com.mantarus.poker.Action trade(com.mantarus.poker.TexasHoldemBoard.BoardInfo boardInfo, java.util.Set<com.mantarus.poker.Action.ActionEnum> possibleActions) {
    return strategy.trade(playerInfo, boardInfo, possibleActions);
}