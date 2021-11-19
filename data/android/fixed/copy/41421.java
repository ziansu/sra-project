public java.lang.Object getValueAt(int row, int column) {
    java.util.ArrayList<?> rowData = tableData.get(row);
    return rowData.get(column);
}