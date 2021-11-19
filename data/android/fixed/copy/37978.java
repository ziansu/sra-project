@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.mcmoddev.nethermetals.NetherMetals.logger = org.apache.logging.log4j.LogManager.getFormatterLogger(com.mcmoddev.nethermetals.NetherMetals.MODID);
    com.mcmoddev.nethermetals.NetherMetals.proxy.preInit(event);
}