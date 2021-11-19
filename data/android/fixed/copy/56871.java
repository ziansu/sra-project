@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.LOWEST)
public void dropEvent(net.minecraftforge.event.entity.living.LivingDropsEvent event) {
    drop(event.entityLiving, event.source, event.drops);
}