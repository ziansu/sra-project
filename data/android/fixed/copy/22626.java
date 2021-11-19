public static boolean hasKey(@javax.annotation.Nullable
net.minecraft.item.ItemStack stack, @javax.annotation.Nullable
java.lang.String... keys) {
    return (stack != null) && (com.infinityraider.agricraft.utility.NBTHelper.hasKey(stack.getTagCompound(), keys));
}