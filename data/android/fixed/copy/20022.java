private boolean hasVerticalWinner(java.lang.String token) {
    return lastDroppedColumn.hasWinner(token);
}