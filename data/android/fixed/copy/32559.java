public int getUpdateVersionCode() {
    switch (getType()) {
        case BUKKIT :
            return (com.timvisee.dungeonmaze.DungeonMaze.getVersionCode()) + 1;
        default :
            return getUniversalUpdater().getUpdateDataUpdateCode();
    }
}