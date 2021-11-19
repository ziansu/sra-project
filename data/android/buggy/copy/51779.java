public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(new com.jtmnf.simpleoregen.proxy.TickHandler(net.minecraft.client.Minecraft.getMinecraft()));
}