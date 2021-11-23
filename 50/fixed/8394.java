public boolean getCell(int row, int column) {
    return this.field[fixRow(row)][fixColumn(column)];
}