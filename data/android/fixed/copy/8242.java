public java.lang.Object getLocalValue(java.lang.String rowKey, int col) {
    return localValues.get(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col));
}