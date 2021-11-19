@java.lang.Override
protected void getPacketData(net.minecraft.network.PacketBuffer data) {
    data.writeFloat(heat.T);
    data.writeFloat(fuel);
    data.writeFloat(burnRate);
}