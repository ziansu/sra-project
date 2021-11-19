@com.lenis0012.bukkit.marriage2.internal.Register(name = "database", type = com.lenis0012.bukkit.marriage2.internal.Register.Type.DISABLE)
public void saveDatabase() {
    unloadAll();
    dataManager.close();
}