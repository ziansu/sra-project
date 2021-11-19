public com.fundynamic.d2tm.game.entities.projectiles.Projectile makeProjectileWithOnlyEntityData() {
    com.fundynamic.d2tm.game.entities.EntityData entityData = new com.fundynamic.d2tm.game.entities.EntityData();
    entityData.setFacingsAndCalculateChops(16);
    return new com.fundynamic.d2tm.game.entities.projectiles.Projectile(null, null, null, null, entityData, null);
}