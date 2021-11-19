public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    this.items.deserializeNBT(compound.getCompoundTag("Items"));
    this.cookTimeRemaining = compound.getInteger("CookTime");
}