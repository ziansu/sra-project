public int getUpdateVersionCode() {
    switch (getType()) {
        default :
        case UNIVERSAL :
            return getUniversalUpdater().getUpdateDataUpdateCode();
        case BUKKIT :
            return (com.timvisee.dungeonmaze.DungeonMaze.getVersionCode()) + 1;
    }
}