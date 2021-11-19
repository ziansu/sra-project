@javax.annotation.Nonnull
@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    net.minecraft.nbt.NBTTagCompound nbt = stack.getTagCompound();
    return (("item." + (malte0811.industrialWires.IndustrialWires.MODID)) + ".key.") + (malte0811.industrialWires.items.ItemKey.types[stack.getMetadata()]);
}