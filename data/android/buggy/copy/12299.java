public Board child(int[] move, boolean color) {
    Board temp = this.copy();
    temp.place(new Piece(move[0], move[1], color), color);
    return temp;
}