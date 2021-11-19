@java.lang.Override
public void onClick(android.view.View arg0) {
    world.model.player.health.max += 500;
    controllerContext.actorStatsController.setActorMaxHealth(world.model.player);
    world.model.player.conditions.clear();
    showToast(mainActivity, "DEBUG: hp set to max", Toast.LENGTH_SHORT);
}