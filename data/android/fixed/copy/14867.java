private void checkValidColumn() {
    int columnToRemove = board.checkValidColumn(buttons);
    if (columnToRemove != (-1)) {
        buttons[columnToRemove].setEnabled(false);
    }
}