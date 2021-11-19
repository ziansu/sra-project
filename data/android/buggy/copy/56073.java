protected synchronized void moveRight() {
    for (pieces.Square square : squares) {
        square.x = infrastructure.GameUtil.modulo(((square.x) + 1), GameUtil.BOARD_WIDTH);
    }
}