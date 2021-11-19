public void TPointConfig() {
    newConfig_tpoint = new java.io.File(getDataFolder(), "TPoint.yml");
    TPointConfig = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(newConfig_tpoint);
    saveLastPlayerJoinConfig();
}