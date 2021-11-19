public com.mantarus.poker.Action trade(int stake, com.mantarus.poker.TexasHoldemBoard.BoardInfo boardInfo, java.util.Set<com.mantarus.poker.Action.ActionEnum> possibleActions) {
    return strategy.trade(stake, playerInfo, boardInfo, possibleActions);
}