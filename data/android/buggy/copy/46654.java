public void clearBoard() {
    for (chessgame.Square square : chessgame.ChessBoard.board) {
        square.highlight(false);
        square.clear();
    }
}