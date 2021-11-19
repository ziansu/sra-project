public void takeTurn(Player player, int row, int column) {
    traverseBoard(row, column);
    player.setCanUndo(true);
    _endOfTurn = true;
    notifyPits();
}