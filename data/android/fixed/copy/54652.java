private void success() {
    hasSolution = true;
    sudokuGrid = sudoku.Converter.ConstraintNetworkToSudokuFile(network, sudokuGrid.getN(), sudokuGrid.getP(), sudokuGrid.getQ());
}