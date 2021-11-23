@org.spongepowered.api.event.Listener
public void onServerStart(org.spongepowered.api.event.game.state.GameStartedServerEvent event) {
    com.gmail.eliterscripts.CommandManager.registerAll();
    new com.gmail.eliterscripts.ConfigManager();
    com.gmail.eliterscripts.ConfigManager.startup();
}