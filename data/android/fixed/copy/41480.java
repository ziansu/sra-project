public boolean setTile(int x, int y, base_attack.TileType type) {
    if ((fields[x][y]) == null)
        return false;
    
    fields[x][y].setType(type);
    return true;
}