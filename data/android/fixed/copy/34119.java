public Entity getTileOccupant(Point pt) {
    if (withinBounds(pt)) {
        return this.occupancy.getCell(pt);
    }
    return null;
}