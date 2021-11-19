@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(com.stormy.lightningadditions.FMLPostInitializationEvent event) {
    com.stormy.lightningadditions.utility.logger.LALogger.log("LA Post-Initialisation!");
    com.stormy.lightningadditions.LightningAdditions.proxy.postInit(event);
    net.minecraft.client.Minecraft.getMinecraft().getFramebuffer().enableStencil();
    MinecraftForge.EVENT_BUS.register(new com.stormy.lightningadditions.block.ore.TooltipEventTemp());
}