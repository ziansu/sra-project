public boolean isCollison(java.lang.Character thisCharacter, float x, float y) {
    updateTileValues(thisCharacter, x, y);
    return collisionModel.isBlocked();
}