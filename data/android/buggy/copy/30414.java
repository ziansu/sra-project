protected boolean isSpaceFreeFullCheck(net.torocraft.chess.engine.chess.ChessPieceState.Position positionToCheck) {
    return ((positionToCheck != null) && (isSpaceFree(positionToCheck))) && (!(willPutKingInCheck(positionToCheck)));
}