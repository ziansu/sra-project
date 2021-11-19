@java.lang.Override
public double getDurabilityForDisplay(net.minecraft.item.ItemStack stack) {
    return ((double) (this.getDurability(stack))) / ((double) (this.getMaxDurability(stack)));
}