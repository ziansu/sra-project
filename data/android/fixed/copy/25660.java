private boolean isNotCreativeThrower() {
    net.minecraft.entity.EntityLivingBase thrower = this.getThrower();
    return (!(thrower instanceof net.minecraft.entity.player.EntityPlayer)) || (!(((net.minecraft.entity.player.EntityPlayer) (thrower)).capabilities.isCreativeMode));
}