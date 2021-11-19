public void removeEntityAt(Point pt) {
    if (isOccupied(pt)) {
        Positionable entity = ((Positionable) (getTileOccupant(pt)));
        entities.remove(entity);
        occupancy.setCell(pt, null);
    }
}