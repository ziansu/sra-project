public SmartGrid.SmartGrid CreateGrid(SmartGrid.SmartGrid parent, int col, int row, int colSpan, int rowSpan) {
    SmartGrid.SmartGrid result = CreateGrid("*", "*");
    result.setParent(parent, col, row, colSpan, rowSpan);
    return result;
}