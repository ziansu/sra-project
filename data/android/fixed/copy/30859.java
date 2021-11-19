public int getNbrCells() {
    return (_om.getInteger(getKey(_keyWidthCells))) * (_om.getInteger(getKey(_keyHeightCells)));
}