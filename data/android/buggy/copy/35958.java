@java.lang.Override
public boolean isEmpty() {
    for (net.minecraft.item.ItemStack i : inv) {
        if (i != null)
            return false;
        
    }
    return true;
}