private boolean isUsingJimmysSword(net.minecraft.entity.player.EntityPlayer player) {
    return player.getCurrentEquippedItem().getItem().equals(ModItems.jimmysSword);
}