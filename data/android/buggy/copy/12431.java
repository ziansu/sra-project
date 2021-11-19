public int getCurrentPlayerDistance(int player, int hole) {
    int current = dicegame.Game.distancesRemaining[getCurrentPlayer()][hole];
    return current;
}