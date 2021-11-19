@java.lang.Override
public void readRestorableFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    readBufferFromNBT(tagCompound, inventoryHelper);
    crystalLiquid = tagCompound.getInteger("liquid");
}