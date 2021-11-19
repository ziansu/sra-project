@net.minecraftforge.fml.common.Mod.EventHandler
public static void preLoad(net.minecraftforge.fml.common.event.FMLPreInitializationEvent PreEvent) {
    com.holydevils.blocks.ModBlocks.manageBlocks();
    com.holydevils.items.ModItems.createItems();
    com.holydevils.main.CraftingManager.craftRegister();
    net.minecraftforge.fml.common.registry.GameRegistry.registerWorldGenerator(com.holydevils.main.MainRegistry.mWorld, 1);
    com.holydevils.creativetabs.CreativeTabsRegistry.registerCreativeTabs();
    com.holydevils.main.MainRegistry.proxyServer.registerRenderInfo();
}