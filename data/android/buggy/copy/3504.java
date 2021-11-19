private void handleCellEditStart(final javafx.scene.control.TableColumn.CellEditEvent<S, ?> aEvent) {
    this.calcNextAndPreviousPosition(aEvent.getTablePosition());
}