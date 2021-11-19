public void setEndPoint(int x, int y) {
    isValidLoc(x, y);
    if (grid[x][y].isPassable)
        endPoint = new CellLoc(x, y);
    
}