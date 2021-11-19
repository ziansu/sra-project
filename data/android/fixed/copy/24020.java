@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onCrafting(cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent event) {
    if ((event.player) != null) {
        pneumaticCraft.common.AchievementHandler.giveAchievement(event.player, event.crafting);
    }
}