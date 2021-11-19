public java.lang.Object getValueAt(int row, int col) {
    return new javafx.util.Pair<java.lang.String, java.lang.String>(strings[row][col], ((java.lang.String) (values[row][col])));
}