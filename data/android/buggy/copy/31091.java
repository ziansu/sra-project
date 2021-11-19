@java.lang.Override
public void writeToRemoteNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.writeToRemoteNBT(nbt);
    if ((this.locomotive) != null) {
        nbt.setBoolean("bound", isBound);
    }
}