private void refreshGuide(net.minecraft.item.ItemStack stack) {
    if ((this.gui) == null) {
        return ;
    }
    this.gui.itemPlaced(stack);
}