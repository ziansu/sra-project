public crosstheborder.lib.Tile getTile(int x, int y) {
    try {
        return tiles[x][y];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        crosstheborder.lib.Map.LOGGER.log(java.util.logging.Level.SEVERE, e.toString(), e);
    }
    return null;
}