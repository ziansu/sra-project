public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    totoro.unreality.common.CommonProxy.plasmaUpgrade = new totoro.unreality.common.item.ItemPlasmaUpgrade();
    totoro.unreality.common.CommonProxy.plasmaUpgrade.initModel();
}