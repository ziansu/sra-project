public static void invalidatePlayer(java.lang.String name) {
    japura.Tribes.Tribes.playerCache.remove(name.toLowerCase());
}