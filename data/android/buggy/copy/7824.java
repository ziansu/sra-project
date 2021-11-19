@java.lang.Override
public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.writeEntityToNBT(nbt);
    nbt.setInteger("resinLevel", this.resinLevel);
}