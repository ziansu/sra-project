@java.lang.Override
public void onDisable() {
    io.github.davidg95.equestricraftplugin.EquestriCraftPlugin.LOG.log(java.util.logging.Level.INFO, "Saving horses to file");
    container.saveHorses();
    io.github.davidg95.equestricraftplugin.DataContainer.destroyInstance();
    checkerThread.setRun(false);
    checkerThread = null;
    org.bukkit.event.HandlerList.unregisterAll(io.github.davidg95.equestricraftplugin.EquestriCraftPlugin.plugin);
}