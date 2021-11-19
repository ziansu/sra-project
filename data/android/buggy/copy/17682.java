private void updateGrid() {
    for (int row = 0; row < (com.jsaop.conways.app.GameOfLife.CELLS_WIDE); row++)
        for (int col = 0; col < (com.jsaop.conways.app.GameOfLife.CELLS_HIGH); col++)
            updateCell(row, col);
        
    
}