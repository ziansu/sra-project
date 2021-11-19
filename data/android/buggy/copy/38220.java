@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onConfigChanged(cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent event) {
    if ((ModUncrafting.MODID.equals(event.modID)) && (!(event.isWorldRunning))) {
        org.jglrxavpok.mods.decraft.common.config.ModConfiguration.syncFromGUI();
    }
}