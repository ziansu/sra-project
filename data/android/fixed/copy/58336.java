@java.lang.Override
public net.minecraft.inventory.Slot getSlot(int index) {
    if ((index < 0) || (index >= (inventorySlots.size()))) {
        return null;
    }
    return ((net.minecraft.inventory.Slot) (inventorySlots.get(index)));
}