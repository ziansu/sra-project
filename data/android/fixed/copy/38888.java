public int getCursorStart(int position) {
    recall.RecallCell recallCell = ((recall.RecallCell) (getChildAt(getAdjustedPosition(position))));
    return recallCell == null ? 0 : recallCell.getSelectionStart();
}