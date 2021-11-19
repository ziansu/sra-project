@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void oreRegisterHook(net.minecraftforge.oredict.OreDictionary.OreRegisterEvent event) {
    com.github.hokutomc.lib.oredict.HT_SensitiveOreDict.registerSensitiveOre(event.Name, com.github.hokutomc.lib.item.HT_ItemCondition.ofItemStack(event.Ore));
}