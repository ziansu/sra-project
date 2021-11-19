public void onEnable() {
    new me.oskar3123.staffchat.bungee.MetricsLite(this);
    saveDefaultConfig();
    if (!(reloadConfig())) {
        getLogger().severe("Could not load config file, using defaults.");
    }
    registerCommands();
    registerEvents();
}