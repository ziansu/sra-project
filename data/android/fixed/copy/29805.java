@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.readFromNBT(tagCompound);
    powerLevel = tagCompound.getByte("powered");
    readRestorableFromNBT(tagCompound);
}