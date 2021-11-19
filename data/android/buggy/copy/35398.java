public void fire(net.minecraft.entity.EntityLivingBase entity, double distance) {
    if (entity.worldObj.isRemote) {
        return ;
    }
    this.target = this.rayTrace(entity, distance, 0);
}