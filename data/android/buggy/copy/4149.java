public static void invalidatePlayer(java.lang.String name) {
    japura.Tribes.Tribes.log((("invalidating " + name) + "'s cache"));
    japura.Tribes.Tribes.playerCache.remove(name.toLowerCase());
}