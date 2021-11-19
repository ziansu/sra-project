private void registerEventListeners() {
    Polearms.logger.info("Registering event listeners");
    MinecraftForge.EVENT_BUS.register(new trueForce.polearms.EventHandler());
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new trueForce.polearms.EventHandler());
}