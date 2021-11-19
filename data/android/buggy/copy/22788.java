public net.minecraft.nbt.NBTTagCompound saveDataToPacket() {
    updateTorchAge(getWorld().getTotalWorldTime());
    net.minecraft.nbt.NBTTagCompound dataPacket = getTileData();
    this.writeToNBT(dataPacket);
    return dataPacket;
}