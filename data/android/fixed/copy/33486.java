@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    tag.setInteger("progress", progress);
    tag.setBoolean("isCooking", isCooking);
}