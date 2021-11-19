public void setBoard(main.BoardView b) {
    this.board = b;
    this.rows = b.getHeight();
    this.cols = b.getWidth();
    this.repaint();
}