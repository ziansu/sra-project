public boolean destroyTile(model.Tile t) {
    if (t == null) {
        return false;
    }
    tiles[t.row][t.col] = null;
    return true;
}