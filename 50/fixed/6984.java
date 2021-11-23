@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = getSlotFromIndex(slot, index);
    return handler.getStackInSlot(slot);
}