@java.lang.Override
public void handleUpdateTag(net.minecraft.nbt.NBTTagCompound tag) {
    cofh.core.network.PacketHandler.handleNBTPacket(tag);
}