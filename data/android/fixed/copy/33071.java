@cpw.mods.fml.common.Mod.EventHandler
public void postInit(cpw.mods.fml.common.event.FMLPostInitializationEvent event) {
    enviromine.core.EnviroMine.proxy.postInit(event);
    enviromine.core.EM_ConfigHandler.initConfig();
}