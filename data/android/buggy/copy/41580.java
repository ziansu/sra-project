public SudokuSquareNode getNext() {
    SudokuSquareNode aSudokuNode = squareToReturn;
    squareToReturn = squareToReturn.getNext();
    return aSudokuNode;
}