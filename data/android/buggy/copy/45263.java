@cpw.mods.fml.common.Mod.EventHandler
public void Init(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new MiscUtils.Utils.PlayerTickHandler());
}