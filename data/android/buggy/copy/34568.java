@net.minecraftforge.fml.common.Mod.EventHandler
public void onInit(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    net.ecocraft.ecocore.registry.EcoRegistry.registerObjRecipes();
    net.ecocraft.ecocore.registry.EcoRegistry.registerOreDicts();
    net.ecocraft.ecocore.registry.EcoRegistry.registerEntities();
    net.ecocraft.ecocore.registry.EcoRegistry.registerIRegisters();
    net.ecocraft.ecocore.EcoCore.proxy.onInit();
}