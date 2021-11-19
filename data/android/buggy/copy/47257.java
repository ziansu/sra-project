public java.lang.String setBoard(java.lang.String board) {
    log.info("setting board to type {}", board);
    this.boardType = board;
    createPinList();
    broadcastState();
    return board;
}