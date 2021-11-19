private java.lang.Boolean checkFinishGameAtDealPhase() {
    return (currentGameData.checkDealerBlackJack()) || (currentGameData.checkPlayerBlackJack());
}