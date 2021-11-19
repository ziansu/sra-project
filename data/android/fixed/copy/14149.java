public static void setValue(java.lang.String path, java.lang.Object value) {
    me.Aubli.ZvP.ZvPConfig.getConfig().set(path, value);
    me.Aubli.ZvP.ZvPConfig.saveConfig();
    me.Aubli.ZvP.ZvPConfig.reloadConfig();
}