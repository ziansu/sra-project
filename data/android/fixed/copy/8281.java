void doRestart() {
    stopTimer();
    if ((isFirstClickDo) && (!(isGameEnd))) {
        myApp.writeStatistics(currentWidth, currentHeight, currentMines);
    }
    setOriginalValue();
    gameField.restartField();
    isRestartGame = true;
}