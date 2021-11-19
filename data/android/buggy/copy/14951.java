public boolean percolates() {
    if ((this.size) == 1) {
        if ((grid[0][0]) == false) {
            return false;
        }
    }
    return wquf.connected(top, bot);
}