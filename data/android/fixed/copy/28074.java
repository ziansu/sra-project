private void revealAll() {
    for (org.minesweeper.core.Cell[] row : board) {
        for (org.minesweeper.core.Cell cell : row) {
            if (!(hasBeenRevealed(cell))) {
                reveal(get(cell));
            }
        }
    }
}