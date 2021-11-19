@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    heat.save(nbt, "heat");
    nbt.setFloat("fuel", fuel);
    nbt.setFloat("burn", burnRate);
    return super.writeToNBT(nbt);
}