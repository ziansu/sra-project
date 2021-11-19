public org.openbw.bwapi4j.TilePosition getBoundingBoxSize() {
    return this.bottomRight.subtract(this.topLeft).add(new org.openbw.bwapi4j.TilePosition(1, 1));
}