public java.lang.String toString() {
    java.lang.String string = "";
    for (pl.mligeza.curiosity.level.tiles.Tile tile : tiles) {
        string += (tile.id) + ", ";
    }
    return string;
}