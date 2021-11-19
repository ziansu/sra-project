public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    net.minecraft.nbt.NBTTagCompound newTag = new net.minecraft.nbt.NBTTagCompound();
    if ((fluidInv) != null)
        fluidInv.writeToNBT(newTag);
    
    tag.setTag(tankName, tag);
}