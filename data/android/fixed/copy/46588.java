@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    return (super.isItemValidForSlot(slot, stack)) && ((this.te.isCreative()) == false);
}