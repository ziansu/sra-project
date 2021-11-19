public boolean forceMove(player.Move m) {
    java.lang.System.out.println("Call forceMove");
    if (this.currentBoard.isValidMove(this.machineColor, m)) {
        this.currentBoard.move(m, this.machineColor);
        return true;
    }
    return false;
}