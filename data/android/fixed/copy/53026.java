private void incrementCellId() {
    cellId = ((cellId) + 1) % (road.getNumCells());
    java.lang.System.out.println(cellId);
}