public static net.minecraft.nbt.NBTTagCompound getTag(net.minecraft.item.ItemStack stack) {
    if (com.infinityraider.agricraft.utility.StackHelper.hasTag(stack)) {
        return stack.getTagCompound();
    }else {
        net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
        stack.setTagCompound(tag);
        return tag;
    }
}