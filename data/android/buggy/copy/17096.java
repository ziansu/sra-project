@java.lang.Override
public net.minecraft.network.play.server.SPacketUpdateTileEntity getUpdatePacket() {
    net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
    writeToNBT(tag);
    return new net.minecraft.network.play.server.SPacketUpdateTileEntity(pos, 0, tag);
}