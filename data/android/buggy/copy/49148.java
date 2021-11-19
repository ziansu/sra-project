private boolean isFinished() {
    return (board.hasWon(Seed.CROSS)) || ((board.hasWon(Seed.NOUGHT)) || (board.isDraw()));
}