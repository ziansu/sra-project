@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int index) {
    net.minecraft.item.ItemStack stackInSlot = getStackInSlot(index);
    if (stackInSlot == null) {
        return null;
    }
    setInventorySlotContents(index, null);
    return stackInSlot;
}