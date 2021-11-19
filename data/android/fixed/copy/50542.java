@java.lang.Override
public net.minecraft.network.Packet getDescriptionPacket() {
    net.minecraft.nbt.NBTTagCompound nbt = new net.minecraft.nbt.NBTTagCompound();
    writeToNBT(nbt);
    return new net.minecraft.network.play.server.S35PacketUpdateTileEntity(this.pos, getBlockMetadata(), nbt);
}