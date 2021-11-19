@java.lang.Override
public boolean canInsertItem(final int slot, final net.minecraft.item.ItemStack srcItem, final net.minecraft.util.EnumFacing side) {
    return this.isItemValidForSlot(slot, srcItem);
}