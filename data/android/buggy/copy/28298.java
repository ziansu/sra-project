@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(new net.kloudspace.pro.events.KEventHandler());
    MinecraftForge.EVENT_BUS.register(new net.kloudspace.pro.events.PlayerConstructingEvents());
    Items.flint.setHarvestLevel("axe", 0);
}