public void TPointConfig() {
    this.newConfig_tpoint = new java.io.File(getDataFolder(), "TPoint.yml");
    this.TPointConfig = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(this.newConfig_tpoint);
    saveLastPlayerJoinConfig();
}