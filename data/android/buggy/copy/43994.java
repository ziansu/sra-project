@cpw.mods.fml.common.Mod.EventHandler
public static void load(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    com.crafter6789.loztwiprincess.world.dimension.DimensionRegistry.registerDimensions();
    com.crafter6789.loztwiprincess.world.dimension.DimensionRegistry.registerWorldProvider();
}