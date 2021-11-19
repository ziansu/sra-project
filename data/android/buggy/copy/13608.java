@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    this.helper.writeToNBT(compound, "e");
    return super.writeToNBT(compound);
}