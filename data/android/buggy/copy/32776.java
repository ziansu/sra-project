private void handleMoveEnd(es.ucm.fdi.tp.views.swing.Board board, es.ucm.fdi.tp.views.swing.Piece turn, boolean success) {
    boardComponent.setEnabled(isPieceTurn(turn));
    redrawBoard();
}