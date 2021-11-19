public boolean gameInProgress() {
    if ((currentGame) == null)
        return false;
    
    return currentGame.getCurrentState().gameComplete();
}