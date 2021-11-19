public void deselectCell() {
    if ((getCurrentCell()) != null) {
        getCurrentCell().setSelection(false);
        currentCell = null;
        releaseButtons();
    }
}