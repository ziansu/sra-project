public java.util.ArrayList<java.lang.Integer> getPencils(int row, int col) {
    return cells[(row - 1)][(col - 1)].getPencils();
}