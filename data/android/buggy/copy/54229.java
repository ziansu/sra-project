@java.lang.Override
public boolean apply(@javax.annotation.Nullable
net.minecraft.item.ItemStack stack) {
    if (stack == null)
        return false;
    
    return ItemMaterialRegistry.INSTANCE.matches(stack, types);
}