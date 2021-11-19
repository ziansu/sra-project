@java.lang.Override
public void onDisable() {
    org.bukkit.plugin.PluginDescriptionFile desc = getDescription();
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("Minecraft");
    logger.info(((desc.getName()) + " has been disabled."));
}