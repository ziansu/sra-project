public boolean destroyGame(final int gameID) {
    gameList.get(gameID).stop();
    gameList.set(gameID, null);
    return true;
}