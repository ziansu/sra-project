public void pickupItem(net.minecraft.item.ItemStack itemStack) {
    if (mergeItemStack(itemStack, 0, inventorySlots.size(), false)) {
        inventory.markDirty();
    }
}