private void incrementCellId() {
    cellId = ((cellId) + 1) % (road.getNumCells());
}