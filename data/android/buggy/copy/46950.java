private void updatePiece() {
    setItemFields();
    presenter.updatePiece(editItem.getID(), editItem, true);
}