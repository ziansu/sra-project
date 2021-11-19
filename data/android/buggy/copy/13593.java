public final void setRowColor(int row, java.awt.Color c) {
    int i = mapRowNumber(row);
    if (c == null) {
    }
    rowColorMap.put(new java.lang.Integer(i), c);
}