private static int getFrequency(org.bukkit.Location l) {
    return me.mrCookieSlime.Slimefun.api.BlockStorage.getBlockInfo(l).getInt("frequency");
}