private java.lang.Boolean checkFinishGameAtDealPhase() {
    return ((currentGameData.checkPush()) || (currentGameData.checkDealerBlackJack())) || (currentGameData.checkPlayerBlackJack());
}