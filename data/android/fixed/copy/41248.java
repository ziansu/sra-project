public static void setTagForPart(net.minecraft.item.ItemStack stack, net.minecraft.item.Item toolPart) {
    net.minecraft.nbt.NBTTagCompound tag = slimeknights.tconstruct.library.utils.TagUtil.getTagSafe(stack);
    tag.setString(slimeknights.tconstruct.library.tools.Pattern.TAG_PARTTYPE, toolPart.getRegistryName().toString());
    stack.setTagCompound(tag);
}