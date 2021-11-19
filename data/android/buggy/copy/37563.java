public static net.minecraft.item.ItemStack getFirstItemInInv(net.minecraft.item.ItemStack[] i) {
    for (net.minecraft.item.ItemStack stack : i)
        if (stack != null)
            return stack;
        
    
    return null;
}