public com.dbash.models.DungeonPosition getRandomPointForTunnels(boolean isFloorRequired) throws com.dbash.models.Map.MapException {
    return getRandomPoint(isFloorRequired, true, true, border, false);
}