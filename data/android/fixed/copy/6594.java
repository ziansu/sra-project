@net.minecraftforge.fml.common.Mod.EventHandler
public void load(net.minecraftforge.fml.common.event.FMLInitializationEvent evt) {
    MinecraftForge.EVENT_BUS.register(com.irtimaled.bbor.forge.ForgeMod.proxy);
    com.irtimaled.bbor.forge.ForgeMod.proxy.init(configManager);
}