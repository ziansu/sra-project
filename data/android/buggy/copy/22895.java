@net.minecraftforge.fml.common.Mod.EventHandler
public void onInit(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    if ((com.dyn.DYNServerMod.status) == (com.dyn.utils.PlayerLevel.MENTOR)) {
        com.dyn.mentor.MentorUI.proxy.init();
    }
}