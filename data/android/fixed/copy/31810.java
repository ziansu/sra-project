private static java.lang.String getModName(net.minecraft.item.ItemStack stack) {
    if (stack == null) {
        return "";
    }
    return stack.getItem().getRegistryName().getResourceDomain();
}