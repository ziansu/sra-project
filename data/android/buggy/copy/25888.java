@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onServerDisconnect(treechopper.core.PlayerEvent.PlayerLoggedOutEvent event) {
    StaticHandler.playerPrintUnName.remove(event.player.getEntityId());
    StaticHandler.playerHoldShift.remove(event.player.getEntityId());
}