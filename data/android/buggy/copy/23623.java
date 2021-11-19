public void createBoard(final long gameID) {
    final de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Board board = new de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Board();
    this.boards.put(gameID, board);
    java.lang.System.err.println(("this.boards" + (this.boards)));
}