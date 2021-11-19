@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    return ("item." + (this.getVariantForMeta(stack.getMetadata()))) + ".name";
}