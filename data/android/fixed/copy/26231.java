@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onMinecartUpdate(net.minecraftforge.event.entity.minecart.MinecartUpdateEvent event) {
    net.minecraft.entity.item.EntityMinecart cart = event.getMinecart();
    com.minemaarten.signals.capabilities.CapabilityMinecartDestination cap = cart.getCapability(CapabilityMinecartDestination.INSTANCE, null);
    if (cap != null)
        cap.onCartUpdate(event);
    
}