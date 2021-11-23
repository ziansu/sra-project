private boolean isCarryingList() {
    net.minecraft.item.ItemStack stack = mc.thePlayer.inventory.getItemStack();
    return (stack != null) && ((stack.getItem()) instanceof buildcraft.core.ItemList);
}