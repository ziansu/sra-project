@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager networkManager, net.minecraft.network.play.server.SPacketUpdateTileEntity packet) {
    net.minecraftforge.fml.common.FMLLog.log(Level.WARN, ("onDataPacket() called... packet: " + (packet.toString())));
    readFromNBT(packet.getNbtCompound());
}