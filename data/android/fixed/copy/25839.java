@java.lang.Override
public boolean canExtractItem(int slot, net.minecraft.item.ItemStack item, int side) {
    if (slot == 0) {
        return false;
    }
    return isStackEqualToLock(item);
}