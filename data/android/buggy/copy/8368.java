@java.lang.Override
public void run() {
    gameUI.placeTokens(gamePieceLoc);
    gameUI.gameHistoryTA.appendText((gameUpdate + "\n"));
}