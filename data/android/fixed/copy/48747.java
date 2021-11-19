public void pluginError(java.lang.String input) {
    getLogger().warning((input + " was not installed! This plugin is required!"));
    getServer().getPluginManager().disablePlugin(this);
}