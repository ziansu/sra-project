public void setCoordinate(entity.Coordinate newCoord) {
    deleteGridInstance();
    coord = newCoord;
    updateGrid();
}