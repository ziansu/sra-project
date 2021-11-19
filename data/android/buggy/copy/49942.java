private static int getFrequency(org.bukkit.Location l) {
    return java.lang.Integer.parseInt(me.mrCookieSlime.Slimefun.api.BlockStorage.getBlockInfo(l).getString("frequency"));
}