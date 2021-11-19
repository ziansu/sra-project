public com.dbash.models.DungeonPosition getRandomPointForMonsterPlacement(boolean isFloorRequired) throws com.dbash.models.Map.MapException {
    return getRandomPoint(isFloorRequired, false, false, border, true);
}