@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onConfigChanged(cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent event) {
    if ((event.modID.equals(ModUncrafting.MODID)) && (!(event.isWorldRunning))) {
        org.jglrxavpok.mods.decraft.common.config.ModConfiguration.syncFromGUI();
    }
}