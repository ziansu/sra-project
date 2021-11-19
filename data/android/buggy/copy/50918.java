@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    return slot == 0 ? super.insertItem(0, stack, simulate) : stack;
}