public com.labs.dm.sudoku.solver.core.IMatrix load(java.lang.String fileName) throws java.io.IOException {
    java.lang.String inputText = readFileAsString(fileName);
    int[] tab = convertToIntTable(toTable(inputText));
    return new com.labs.dm.sudoku.solver.core.Matrix(tab);
}