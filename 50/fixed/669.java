@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    inventory.setInventorySlotContents(slot, stack);
    while (useBucket(0, getStackInSlot(0)));
}