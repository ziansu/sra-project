public boolean moveVoidTile(GameEngine.Directions direction) {
    if (isMoveAllowed(direction)) {
        moveTileVoid(direction);
        return true;
    }
    return false;
}