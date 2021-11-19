public double getParameterValue(int index) {
    int row = index / (rowDimension);
    int col = index % (rowDimension);
    return super.getParameterValue(row, col);
}