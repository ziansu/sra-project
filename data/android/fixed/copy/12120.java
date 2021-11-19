public boolean isSolved() {
    boolean isSolved = true;
    for (com.kenkensolver.data.Cell cell : getCells()) {
        isSolved &= cell.isSolved();
    }
    return isSolved;
}