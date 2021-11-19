private void sendPacket(us.myles.ViaVersion.boss.ViaBossBar.UpdateAction action) {
    io.netty.buffer.ByteBuf buf = getPacket(action);
    for (java.util.UUID uuid : players)
        sendPacket(uuid, buf);
    
}