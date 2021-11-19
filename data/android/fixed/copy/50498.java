@javax.annotation.Nonnull
@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    compound = super.writeToNBT(compound);
    this.writeSyncableNBT(compound, false);
    return compound;
}