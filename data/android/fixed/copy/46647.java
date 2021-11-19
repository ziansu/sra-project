@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    super.init(event);
    this.registerColorHandlers();
}