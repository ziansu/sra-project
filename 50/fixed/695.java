private boolean gameStart() {
    if (!(this.isGameLoaded)) {
        backToMainMenu("game not loaded...");
        return true;
    }
    this.isGameRun = true;
    this.showStatusGame();
    return true;
}