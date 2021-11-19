@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent e) {
    com.snowshock35.jeiintegration.JEIIntegration.logger = e.getModLog();
    com.snowshock35.jeiintegration.JEIIntegration.config = new com.snowshock35.jeiintegration.config.Config(e);
    MinecraftForge.EVENT_BUS.register(com.snowshock35.jeiintegration.JEIIntegration.config);
}