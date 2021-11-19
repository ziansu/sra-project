@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.readFromNBT(tagCompound);
    if (supportsRedstoneInput()) {
        powerLevel = tagCompound.getByte("powered");
    }
    readRestorableFromNBT(tagCompound);
}