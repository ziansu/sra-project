private void addPointerCowCol(int row, int col, java.util.Set<java.lang.Integer> playerRows, java.util.Set<java.lang.Integer> playerCols) {
    playerRows.add(row);
    java.util.Collections.sort(playerRows);
    playerCols.add(col);
    java.util.Collections.sort(playerCols);
}