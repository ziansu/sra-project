public nl.tudelft.pixelperfect.gamestates.GameState handleState() {
    if (game.isReset()) {
        game.resetGame();
        return new nl.tudelft.pixelperfect.gamestates.StartState(game);
    }
    return this;
}