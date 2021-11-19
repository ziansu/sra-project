public synchronized org.bukkit.configuration.file.FileConfiguration getData(com.Ben12345rocks.AdvancedCore.Objects.UserData userData, java.lang.String uuid) {
    synchronized(this) {
        java.io.File dFile = userData.getPlayerFile(uuid);
        org.bukkit.configuration.file.FileConfiguration data = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(dFile);
        notify();
        return data;
    }
}