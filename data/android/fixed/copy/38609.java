public boolean moveVoidTile(GameEngine.Directions direction) {
    if (isMoveAllowed(direction)) {
        java.lang.System.out.println(direction.toString());
        moveTileVoid(direction);
        return true;
    }
    return false;
}