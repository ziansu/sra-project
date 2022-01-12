public static net.minecraft.item.ItemStack getStackFromName(java.lang.String name, int stackSize) {
    net.minecraft.item.ItemStack stack = net.minecraftforge.oredict.OreDictionary.getOres(name).get(0).copy();
    stack.stackSize = stackSize;
    return stack;
}