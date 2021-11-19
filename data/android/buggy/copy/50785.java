public void moveTop() {
    int row = 0;
    posTable.getSelectionModel().setSelectionInterval(row, row);
    posPanel.changeViewPanel();
    showProductInfo(row);
}