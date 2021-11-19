@cpw.mods.fml.common.eventhandler.SubscribeEvent
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void clientDisconnectEvent(cpw.mods.fml.common.network.FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
    com.forgeessentials.customserveritems.TextureRegistry.clear();
    TextureRegistry.enabled = false;
}