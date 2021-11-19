public void setRemoteItem(net.minecraft.item.ItemStack drop) {
    this.drop = drop.copy();
    if (drop != null)
        this.drop.stackSize = 1;
    
}