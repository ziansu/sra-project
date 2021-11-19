@java.lang.Override
public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.readEntityFromNBT(nbt);
    this.resinLevel = nbt.getInteger("resinLevel");
}