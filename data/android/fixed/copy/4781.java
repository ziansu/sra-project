public boolean visited(int x, int y) {
    if (contains(x, y))
        return visited[x][y];
    
    return false;
}