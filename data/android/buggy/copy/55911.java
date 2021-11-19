@cpw.mods.fml.common.Mod.EventHandler
public void postInit(cpw.mods.fml.common.event.FMLPostInitializationEvent event) {
    me.nentify.drillify.item.DrillifyItems.postInit();
    me.nentify.drillify.Drillify.proxy.postInit();
    if ((Config.armourersWorkshopModels) && (cpw.mods.fml.common.Loader.isModLoaded("armourersWorkshop"))) {
        ArmourersCommonManager.instance.postInit();
    }
}