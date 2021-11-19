@java.lang.Override
public void onAboutToStart(org.spongepowered.api.event.game.state.GameAboutToStartServerEvent event) throws java.lang.Exception {
    server.enablePlugins(PluginLoadOrder.STARTUP);
}