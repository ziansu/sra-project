private static void tickEnder(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    if ((event.entity.worldObj.rand.nextDouble()) < 0.1)
        com.lothrazar.samsmagic.potion.PotionRegistry.doPotionParticle(event.entity.worldObj, event.entityLiving, EnumParticleTypes.PORTAL);
    
}