public void resetCell(int row, int col) {
    if (!(this.grid[row][col].modifiable))
        throw new java.lang.RuntimeException("Cannot reset cell; user defined");
    
    this.grid[row][col].value = 0;
}