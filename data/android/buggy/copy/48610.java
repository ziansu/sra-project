public void setCoordinate(entity.Coordinate newCoord) {
    deleteGridInstance();
    coord = newCoord;
    view.setTranslateX(newCoord.getX());
    view.setTranslateX(newCoord.getY());
    updateGrid();
}