public static org.bukkit.configuration.file.FileConfiguration getConfig(java.lang.String file) {
    if (!(com.kkosyfarinis.spigot.xssentials.methods.ConfigFiles.configFiles.containsKey(file))) {
        com.kkosyfarinis.spigot.xssentials.methods.ConfigFiles.loadConfig(file);
    }
    return com.kkosyfarinis.spigot.xssentials.methods.ConfigFiles.configFiles.get(file);
}