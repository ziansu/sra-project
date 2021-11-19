public PolyProperty getCellLocationInFrame(Cell cell, int frame) {
    java.util.Map<Cell, PolyProperty> cellsInFrame = getCellsByFrame(frame);
    return cellsInFrame.get(cell);
}