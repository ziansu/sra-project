public void onDisable() {
    getConfig().set("Global.TimedGlobal.On", false);
    saveConfig();
}