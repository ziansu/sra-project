@cpw.mods.fml.common.Mod.EventHandler
public void serverStop(cpw.mods.fml.common.event.FMLServerStoppedEvent event) {
    pl.asie.computronics.Computronics.storage = null;
    pl.asie.computronics.Computronics.proxy.onServerStop();
    if (pl.asie.computronics.reference.Mods.isLoaded(Mods.OpenComputers)) {
        pl.asie.computronics.Computronics.opencomputers.onServerStop(event);
    }
}