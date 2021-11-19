public static boolean canUseInSafeZone(java.lang.String id) {
    try {
        return io.github.hsyyid.polis.utils.ConfigManager.getAllowedBlocksInSafeZone().contains(id);
    } catch (java.lang.Exception e) {
        io.github.hsyyid.polis.utils.ConfigManager.addUsableSafeZoneBlock("");
        return false;
    }
}