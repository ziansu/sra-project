@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    compound = super.writeToNBT(compound);
    writeSyncedNBT(compound);
    if (!(fluidConsumeStopped)) {
        compound.setInteger("NextConsume", ticksUntilNextFluidConsume);
    }
    return compound;
}