public void play(remixlab.bias.event.ClickEvent event) {
    Board.resetMoves();
    if ((piece) != null) {
        piece.move(x, y, move);
        piece = null;
    }
}