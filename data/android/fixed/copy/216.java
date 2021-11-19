public PolyProperty getCellLocationInFrame(Cell cell, int frame) {
    java.util.Map<Cell, PolyProperty> cellsInFrame = getCellsByFrame(frame);
    if (cellsInFrame == null) {
        return null;
    }
    return cellsInFrame.get(cell);
}