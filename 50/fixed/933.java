@java.lang.Override
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    super.preInit(event);
    com.comze.sanman00.mods.minecraft.expotions.Main.getLogger().info(("Starting client-side pre-init of Explosive Potions mod version " + (com.comze.sanman00.mods.minecraft.expotions.Main.VERSION)));
    net.minecraftforge.fml.common.registry.GameRegistry.registerItem(ItemExplosivePotion.instance, "potion_explosive");
}