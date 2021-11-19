@java.lang.Override
public void update(net.minecraft.entity.player.EntityPlayer player) {
    if (player.isCollidedHorizontally) {
        player.motionY = (player.isSneaking()) ? 0 : 0.2;
    }
    player.fallDistance = 0.0F;
}