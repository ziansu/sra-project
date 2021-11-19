public void getNewBotAction() {
    botHand = botHand.updateVariables();
    calculateOpponentPreflopStats();
    botHand.getNewBotAction();
}