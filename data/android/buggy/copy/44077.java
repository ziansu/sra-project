@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    io.github.tehstoneman.cashcraft.CashCraft.proxy.postInit();
    MinecraftForge.EVENT_BUS.register(new io.github.tehstoneman.cashcraft.event.EventManager());
}