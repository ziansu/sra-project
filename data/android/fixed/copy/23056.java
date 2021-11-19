private boolean hasHorizontalWinner(java.lang.String token) {
    com.github.michaelruocco.connectfour.Grid.Row row = getLastDroppedRow();
    return row.hasWinner(token);
}