public float getChanceToMelt() {
    return ((float) ((com.zmanww.bukkit.SnowControl.Config.plugin.getConfig().getDouble("SnowFall.MeltingChance", 10)) / 100));
}