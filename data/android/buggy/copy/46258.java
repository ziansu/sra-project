public boolean isItem(int slot, net.minecraft.item.Item item) {
    return ((inventoryContents[slot]) != (net.minecraft.item.ItemStack.EMPTY)) && ((inventoryContents[slot].getItem()) == item);
}