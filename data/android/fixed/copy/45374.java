private void deleteRow() {
    int lastRow = (pointListViews.size()) - 1;
    if (lastRow >= 1) {
        pointListPanel.remove(lastRow);
        pointListViews.remove(lastRow);
    }
}