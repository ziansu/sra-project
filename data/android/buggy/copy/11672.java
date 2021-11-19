public boolean worldUnloaded(java.lang.String name) {
    org.bukkit.configuration.file.YamlConfiguration configWM = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(configFileWM);
    return (!(worldExists(name))) && (configWM.contains(name));
}