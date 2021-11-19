public static void particleSpawnedFromEntity(net.minecraft.entity.EntityLivingBase entity, java.lang.String particle) {
    if ((entity instanceof net.minecraft.entity.player.EntityPlayer) && (entity.worldObj.isRemote)) {
        HooksClient.particlePlayerOrigin = ((net.minecraft.entity.player.EntityPlayer) (entity));
    }else
        if (entity.worldObj.isRemote) {
            HooksClient.particlePlayerOrigin = null;
        }
    
}