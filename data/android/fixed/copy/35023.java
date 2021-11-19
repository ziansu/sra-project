public void reload() {
    this.config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file);
    setDefaults(type);
}