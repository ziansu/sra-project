public void reload() {
    setDefaults(type);
    this.config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file);
}