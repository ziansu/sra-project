@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onWorldUnload(net.minecraftforge.event.world.WorldEvent.Unload e) {
    global.worldIsLoaded = false;
}