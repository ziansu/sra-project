public void set(net.minecraft.item.ItemStack itemStack) {
    this.itemStack = itemStack;
    this.item = itemStack.getItem();
    if ((item) instanceof net.minecraft.item.ItemBlock)
        set(net.minecraft.block.Block.getBlockFromItem(itemStack.getItem()));
    
}