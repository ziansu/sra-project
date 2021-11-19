public static boolean isIdAllowed(java.lang.String WorldName, int id) {
    if (!(de.davboecki.multimodworld.server.ModChecker.pluginfound))
        return true;
    
    return de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin().isIdAllowed(WorldName, id);
}