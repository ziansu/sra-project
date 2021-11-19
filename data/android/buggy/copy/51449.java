public boolean hasLiberties(int x, int y, game.Stone s) {
    return (getLiberties(x, y, s).size()) > 0;
}