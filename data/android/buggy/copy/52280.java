@net.minecraftforge.fml.common.Mod.EventHandler
public void onServerStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent event) {
    com.trcgames.dbSynchronizer.DBSynchronizer.worldLoaded = true;
    com.trcgames.dbSynchronizer.DBSynchronizer.network.sendToAll(new com.trcgames.dbSynchronizer.packets.PacketServerToClient(com.trcgames.dbSynchronizer.packets.PacketServerToClient.StCPacketType.UPDATE_WORLD_LOADING_STATE, "start"));
    com.trcgames.dbSynchronizer.database.ServerDatabase.onServerStarting();
}