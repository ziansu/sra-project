public boolean isRowGroupCollapsed(int row) {
    int collapseRow = (findEndOfRowOutlineGroup(row)) + 1;
    if ((getRow(collapseRow)) == null) {
        return false;
    }
    return getRow(collapseRow).getColapsed();
}