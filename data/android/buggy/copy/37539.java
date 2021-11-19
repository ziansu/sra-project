public void run() {
    int lastRow = (tablePositions.getRowCount()) - 1;
    slash.navigation.gui.helpers.JTableHelper.selectAndScrollToPosition(tablePositions, lastRow, lastRow);
}