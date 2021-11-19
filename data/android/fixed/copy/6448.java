@java.lang.Override
public double getDurabilityForDisplay(net.minecraft.item.ItemStack stack) {
    return 1 - (((double) (this.getDurability(stack))) / ((double) (this.getMaxDurability(stack))));
}