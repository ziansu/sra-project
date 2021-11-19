private void checkCastleMoves() {
    if (willPutKingInCheck(chessPieceToMove.position)) {
        return ;
    }
    checkIfCanCastleOnQueenSide();
    checkIfCanCastleOnKingSide();
}