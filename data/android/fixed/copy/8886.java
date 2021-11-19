@net.minecraftforge.fml.common.Mod.EventHandler
public void Init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    for (cf.mcdTeam.Immersion.utils.IModPart part : partlist) {
        part.Init();
    }
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new cf.mcdTeam.Immersion.utils.GuiHandler());
}