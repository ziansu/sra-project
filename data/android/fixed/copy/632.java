public void setRemoteItem(net.minecraft.item.ItemStack drop) {
    if (drop != null) {
        this.drop = drop.copy();
        this.drop.stackSize = 1;
    }else
        this.drop = null;
    
}