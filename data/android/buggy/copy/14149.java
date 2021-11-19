public static void setEconEnabled(boolean enabled) {
    me.Aubli.ZvP.ZvPConfig.getConfig().set("economy.enableEcon", enabled);
    me.Aubli.ZvP.ZvPConfig.saveConfig();
    me.Aubli.ZvP.ZvPConfig.reloadConfig();
}