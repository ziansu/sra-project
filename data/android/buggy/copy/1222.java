@java.lang.Override
public void onSelectionDecreasePainted(int col1, int col2, int colEdgeIndex, int row1, int row2, int rowEdgeIndex) {
    spreadsheetHandler.selectionDecreasePainted(rowEdgeIndex, colEdgeIndex);
    startDelayedSendingTimer();
}