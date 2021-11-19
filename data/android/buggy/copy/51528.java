public boolean isTheMovePossible(oot.game.Token token, int row, int column) {
    return (calcOneField(token, row, column)) == 0 ? false : true;
}