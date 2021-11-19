public static boolean canUseInSafeZone(java.lang.String id) {
    return io.github.hsyyid.polis.utils.ConfigManager.getAllowedBlocksInSafeZone().contains(id);
}