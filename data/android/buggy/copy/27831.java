public void makeMove(com.letitgo.Point p, int stoneType) {
    board.setPoint(p, stoneType);
    removeDeadStones(com.letitgo.Board.getOppositeSide(stoneType));
}