@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int slot, int amount) {
    net.minecraft.item.ItemStack stack = inventory.decrStackSize(slot, amount);
    updateState();
    return stack;
}