@java.lang.Override
protected void onFoodEaten(net.minecraft.item.ItemStack par1ItemStack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
    addAllEffects(world, player);
    com.lothrazar.cyclicmagic.util.UtilEntity.incrementMaxHealth(player, 2);
}