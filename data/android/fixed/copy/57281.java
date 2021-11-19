@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(new lucidas.statclock.program.EventProgram());
    MinecraftForge.EVENT_BUS.register(new lucidas.statclock.statclock.EventStatclock());
    lucidas.statclock.Statclock.proxy.postInit(event);
}