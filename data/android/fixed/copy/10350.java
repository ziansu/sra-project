public void update(board.Grid grid) {
    if (active) {
        if ((grid.clicked) != null) {
            move = grid.clicked.col;
            movemade = true;
            grid.clicked = null;
        }
    }
}