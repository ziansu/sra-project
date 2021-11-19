public static void particleSpawnedFromEntity(net.minecraft.entity.EntityLivingBase entity, java.lang.String particle) {
    if (entity.worldObj.isRemote) {
        HooksClient.particlePlayerOrigin = entity;
    }
}