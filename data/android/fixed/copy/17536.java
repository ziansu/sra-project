@java.lang.Override
public java.lang.String getItemStackDisplayName(net.minecraft.item.ItemStack parItemStack) {
    return com.blogspot.jabelarminecraft.magicbeans.utilities.MagicBeansUtilities.stringToRainbow(net.minecraft.util.StatCollector.translateToLocal(((getUnlocalizedNameInefficiently(parItemStack)) + ".name"))).trim();
}