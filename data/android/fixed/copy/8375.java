public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    registerPackets();
    BlockArmor.configFile = event.getSuggestedConfigurationFile();
    BlockArmor.logger = event.getModLog();
    twopiradians.blockArmor.common.tileentity.ModTileEntities.preInit();
}