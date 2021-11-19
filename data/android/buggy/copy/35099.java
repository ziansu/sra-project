private void sendPacket(us.myles.ViaVersion.boss.ViaBossBar.UpdateAction action) {
    io.netty.buffer.ByteBuf buf = getPacket(action);
    for (java.util.UUID uuid : new java.util.ArrayList<>(players))
        sendPacket(uuid, buf);
    
}