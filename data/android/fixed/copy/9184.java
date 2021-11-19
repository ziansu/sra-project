public java.lang.String getSubmittedValue(java.lang.String rowKey, int col) {
    return submittedValues.get(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col));
}