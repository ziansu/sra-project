private boolean openDoor(tiles.Door tile, character.Player p) {
    if (p.getInven().contains("key")) {
        tile.openDoor();
        return true;
    }
    return false;
}