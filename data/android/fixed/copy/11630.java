public void addCell(application.fxobjects.graph.cell.Cell cell) {
    if (!(cellMap.containsKey(cell.getCellId()))) {
        addedCells.add(cell);
        cellMap.put(cell.getCellId(), cell);
    }
}