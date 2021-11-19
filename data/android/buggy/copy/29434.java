public boolean opponentMove(player.Move m) {
    java.lang.System.out.println("Call opponent Move");
    if (this.currentBoard.isValidMove(humanColor, m)) {
        this.currentBoard.move(m, humanColor);
        return true;
    }
    return false;
}