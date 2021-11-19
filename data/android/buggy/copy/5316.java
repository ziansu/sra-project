@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent evt) {
    ml.core.MLCore.proxy.prInit();
    MinecraftForge.EVENT_BUS.register(WorldGenHandler.instance);
    cpw.mods.fml.common.registry.TickRegistry.registerTickHandler(WorldGenHandler.instance, Side.SERVER);
    cpw.mods.fml.common.registry.GameRegistry.registerWorldGenerator(WorldGenHandler.instance);
}