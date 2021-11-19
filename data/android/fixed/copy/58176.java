void readInitialPosition(java.lang.String initial) {
    initialPosition = new java.lang.String(initial);
    readInitialPosition2(initialPosition, board);
    generateFen(board, initial);
}