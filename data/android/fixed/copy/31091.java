@java.lang.Override
public void writeToRemoteNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.writeToRemoteNBT(nbt);
    nbt.setBoolean("bound", isBound);
}