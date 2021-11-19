@net.minecraftforge.fml.common.Mod.EventHandler
public void serverStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent serverStartingEvent) {
    serverStartingEvent.registerServerCommand(new untouchedwagons.minecraft.mcrd.commands.BuildRecipeListCommand());
}