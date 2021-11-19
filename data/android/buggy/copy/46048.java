public boolean isUseableByPlayer(net.minecraft.entity.player.EntityPlayer entityplayer) {
    if (isDead) {
        return false;
    }
    return (entityplayer.getDistanceSqToEntity(this)) <= 300.0;
}