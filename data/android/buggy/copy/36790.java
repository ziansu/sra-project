public void applyPacket(level.maps.Level level) {
    entity.mobs.Mob mob = engine.GlobalData.getLevelMob(getUniqueID(), level);
    mob.buffManager.removeBuff(engine.gameData.MobData.getBuffType(getBuffID()), false);
}