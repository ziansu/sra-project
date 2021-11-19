@java.lang.Override
public net.minecraft.network.play.server.SPacketUpdateTileEntity getUpdatePacket() {
    net.minecraft.nbt.NBTTagCompound syncData = new net.minecraft.nbt.NBTTagCompound();
    this.writeSyncableDataToNBT(syncData);
    return new net.minecraft.network.play.server.SPacketUpdateTileEntity(this.pos, 1, syncData);
}