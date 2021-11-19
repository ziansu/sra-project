public org.bukkit.configuration.file.FileConfiguration getIslandConfig(final java.lang.String location) {
    if ((this.islands.get(location)) == null) {
        this.reloadIslandConfig(location);
    }
    return this.islands.get(location);
}