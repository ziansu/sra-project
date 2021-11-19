@java.lang.Override
public void onJEIReady(mezz.jei.api.IModRegistry registry) {
    registry.addDescription(new net.minecraft.item.ItemStack(net.darkhax.darkutils.handler.ContentHandler.itemEnchantedRing, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE), "jei.darkutils.baubles.valid.desc");
}