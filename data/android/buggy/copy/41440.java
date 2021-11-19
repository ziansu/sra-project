@java.lang.Override
public void onJoinGame(net.minecraft.network.INetHandler netHandler, net.minecraft.network.play.server.S01PacketJoinGame loginPacket) {
    if (com.blazeloader.util.version.Versions.isClient()) {
        com.blazeloader.event.handlers.client.EventHandlerClient.overrideClientJoinGame(netHandler, loginPacket);
    }
}