@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    return ((slot >= 0) && (slot < (getSizeInventory()))) && (isValid(stack));
}