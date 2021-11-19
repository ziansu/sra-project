public void randomMove() {
    Move move = generateMovementHeur();
    game.movePiece(move.piece.position[0], move.piece.position[1], move.newCoords[0], move.newCoords[1]);
}