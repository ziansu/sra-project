private static int getKey(net.minecraft.entity.player.EntityPlayer player) {
    return (player.hashCode()) << (1 + (player.worldObj.isRemote ? 1 : 0));
}