@java.lang.Override
public void onClick(android.view.View arg0) {
    world.model.player.baseTraits.maxHP = 500;
    world.model.player.health.max = world.model.player.baseTraits.maxHP;
    controllerContext.actorStatsController.setActorMaxHealth(world.model.player);
    world.model.player.conditions.clear();
    showToast(mainActivity, "DEBUG: hp set to max", Toast.LENGTH_SHORT);
}