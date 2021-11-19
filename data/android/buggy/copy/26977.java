public void setPiece(dimitris.android.chessviews.Pieces.Piece piece) {
    if (piece != null) {
        piece.setPositionCoords(row, col);
        this.piece = piece;
    }
}