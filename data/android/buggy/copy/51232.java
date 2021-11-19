public void onEnable() {
    tdiant.bukkit.chestpassword.ChestPassword.plugin = this;
    checkVersion();
    tdiant.bukkit.chestpassword.util.connector.ConnectWithOtherLockChestPlugin.checkOtherPlugin();
    if (tdiant.bukkit.chestpassword.ChestPassword.DISABLE_TAG)
        return ;
    
    tdiant.bukkit.chestpassword.manager.ConfigManager.reloadConfig();
    setSqlite(true);
    registerListener();
}