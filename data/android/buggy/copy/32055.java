@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    items.deserializeNBT(compound.getCompoundTag("Items"));
    cookTimeRemaining = compound.getInteger("CookTime");
}