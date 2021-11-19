private void updateGrid() {
    for (int y = 0; y < (com.jsaop.conways.app.GameOfLife.CELLS_HIGH); y++)
        for (int x = 0; x < (com.jsaop.conways.app.GameOfLife.CELLS_WIDE); x++)
            updateCell(x, y);
        
    
}