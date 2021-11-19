@java.lang.Override
public void readRestorableFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.readRestorableFromNBT(tagCompound);
    readBufferFromNBT(tagCompound, inventoryHelper);
    crystalLiquid = tagCompound.getInteger("liquid");
}