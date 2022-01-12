@com.google.common.eventbus.Subscribe
public void serverStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent evt) {
    evt.registerServerCommand(new net.minecraftforge.server.command.ForgeCommand());
}