@java.lang.Override
public void onDisable() {
    org.bukkit.plugin.PluginDescriptionFile pdfFile = this.getDescription();
    logger.info((("[" + (pdfFile.getName())) + "] is now disabled."));
}