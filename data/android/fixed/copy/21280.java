public void getNewBotAction() {
    botHand = botHand.updateVariables();
    calculateOpponentPreflopStats();
    botHand.getNewBotAction();
    java.lang.System.out.println();
}