public void addBucket(net.minecraft.entity.player.EntityPlayer entityPlayer, net.minecraft.world.World world, com.lothrazar.samscontent.block.TileEntityBucketStorage storage) {
    storage.addBucket();
    int b = storage.getBuckets();
    java.lang.System.out.println(("added up to ===" + b));
    entityPlayer.destroyCurrentEquippedItem();
}