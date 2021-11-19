@java.lang.Override
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    super.init(event);
    totoro.unreality.client.ClientProxy.upgradeRenderer = new totoro.unreality.common.UpgradeRenderer();
    MinecraftForge.EVENT_BUS.register(totoro.unreality.client.ClientProxy.upgradeRenderer);
}