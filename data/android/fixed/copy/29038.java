void getValidNewPositions(main.java.Position position) {
    java.util.List<main.java.Position> validNewPositions = this.board.getValidNewPositions(position);
    this.validMoves = validNewPositions;
    setChanged();
}