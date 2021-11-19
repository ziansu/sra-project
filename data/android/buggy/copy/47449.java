public boolean checkRow(int row, int column, int grid) {
    if ((++(rowGridScore.get(grid)[row])) == (NUMBER_TO_WIN)) {
        return true;
    }
    return false;
}