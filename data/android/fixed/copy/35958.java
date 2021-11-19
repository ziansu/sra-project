@java.lang.Override
public boolean isEmpty() {
    for (net.minecraft.item.ItemStack i : inv) {
        if ((i != null) && (!(i.isEmpty())))
            return false;
        
    }
    return true;
}