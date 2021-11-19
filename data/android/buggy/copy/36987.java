@java.lang.Override
public void deserializeNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    ICapabilityStats.CAPABILITY.getStorage().readNBT(ICapabilityStats.CAPABILITY, this.stats, null, nbt.getCompoundTag("stats"));
}