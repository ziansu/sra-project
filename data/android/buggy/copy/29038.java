void getValidNewPositions(main.java.Position position) {
    java.util.List<main.java.Position> validNewPositions = board.getValidNewPositions(position);
    validMoves = validNewPositions;
    setChanged();
}