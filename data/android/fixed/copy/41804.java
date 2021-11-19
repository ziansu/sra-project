@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    inventoryContents.readFromNBT(tagCompound.getCompoundTag("ContentsChest"));
}