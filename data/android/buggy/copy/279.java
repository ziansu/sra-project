@org.spongepowered.api.event.Subscribe
public void onPreInit(org.spongepowered.api.event.state.PreInitializationEvent event) {
    com.skelril.skree.SkreePlugin.customItemSystem = new com.skelril.skree.system.registry.item.CustomItemSystem(this, game);
    com.skelril.skree.SkreePlugin.customItemSystem.preInit();
    com.skelril.skree.SkreePlugin.customBlockSystem = new com.skelril.skree.system.registry.block.CustomBlockSystem(this, game);
    com.skelril.skree.SkreePlugin.customBlockSystem.init();
}