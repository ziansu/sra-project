@cpw.mods.fml.common.eventhandler.SubscribeEvent(priority = cpw.mods.fml.common.eventhandler.EventPriority.LOW)
public void playerInteractEvent(net.minecraftforge.event.entity.player.PlayerInteractEvent event) {
    if (((event.entityPlayer.getCurrentEquippedItem()) != null) && ((event.entityPlayer.getCurrentEquippedItem().getItem()) instanceof de.yotsuba.mahouka.item.ItemCad)) {
        event.useBlock = cpw.mods.fml.common.eventhandler.Event.Result.DENY;
    }
}